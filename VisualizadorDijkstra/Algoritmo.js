document.addEventListener("DOMContentLoaded", () => {
  const gridContainer = document.getElementById("grid");
  const startButton = document.getElementById("startBtn");
  const clearButton = document.getElementById("clearBtn");
  const totalRows = 20;
  const totalCols = 20;
  let startCell = null;
  let endCell = null;
  let mouseIsDown = false;

  // Create the grid
  for (let row = 0; row < totalRows; row++) {
    for (let col = 0; col < totalCols; col++) {
      const cell = document.createElement("div");
      cell.dataset.row = row;
      cell.dataset.col = col;
      gridContainer.appendChild(cell);
    }
  }

  gridContainer.addEventListener("mousedown", (event) => {
    if (
      event.target.dataset.row !== undefined &&
      event.target.dataset.col !== undefined
    ) {
      mouseIsDown = true;
      handleCellClick(event.target);
    }
  });

  gridContainer.addEventListener("mouseover", (event) => {
    if (
      mouseIsDown &&
      event.target.dataset.row !== undefined &&
      event.target.dataset.col !== undefined
    ) {
      handleCellClick(event.target);
    }
  });

  document.addEventListener("mouseup", () => {
    mouseIsDown = false;
  });

  function handleCellClick(cell) {
    const row = parseInt(cell.dataset.row);
    const col = parseInt(cell.dataset.col);

    if (!startCell) {
      cell.classList.add("start");
      startCell = { row, col, element: cell };
    } else if (!endCell && cell !== startCell.element) {
      cell.classList.add("end");
      endCell = { row, col, element: cell };
    } else if (cell !== startCell.element && cell !== endCell.element) {
      cell.classList.toggle("wall");
    }
  }

  startButton.addEventListener("click", () => {
    if (startCell && endCell) {
      const path = dijkstraAlgorithm(startCell, endCell);
      if (path) {
        animatePath(path);
      }
    }
  });

  clearButton.addEventListener("click", () => {
    startCell = null;
    endCell = null;
    gridContainer.querySelectorAll("div").forEach((cell) => {
      cell.className = "";
    });
  });

  function dijkstraAlgorithm(start, end) {
    const directions = [
      { row: -1, col: 0 },
      { row: 1, col: 0 },
      { row: 0, col: -1 },
      { row: 0, col: 1 },
    ];

    const distanceMatrix = Array.from({ length: totalRows }, () =>
      Array(totalCols).fill(Infinity)
    );
    const visitedMatrix = Array.from({ length: totalRows }, () =>
      Array(totalCols).fill(false)
    );
    const previousNodes = Array.from({ length: totalRows }, () =>
      Array(totalCols).fill(null)
    );

    const priorityQueue = [{ node: start, dist: 0 }];
    distanceMatrix[start.row][start.col] = 0;

    while (priorityQueue.length > 0) {
      priorityQueue.sort((a, b) => a.dist - b.dist);
      const { node, dist } = priorityQueue.shift();

      if (visitedMatrix[node.row][node.col]) continue;
      visitedMatrix[node.row][node.col] = true;

      if (node.row === end.row && node.col === end.col) {
        const path = [];
        let currentNode = end;
        while (currentNode) {
          path.unshift(currentNode);
          currentNode = previousNodes[currentNode.row][currentNode.col];
        }
        return path;
      }

      for (const direction of directions) {
        const newRow = node.row + direction.row;
        const newCol = node.col + direction.col;

        if (
          newRow >= 0 &&
          newRow < totalRows &&
          newCol >= 0 &&
          newCol < totalCols &&
          !visitedMatrix[newRow][newCol] &&
          !gridContainer
            .querySelector(`[data-row='${newRow}'][data-col='${newCol}']`)
            .classList.contains("wall")
        ) {
          const newDist = dist + 1;
          if (newDist < distanceMatrix[newRow][newCol]) {
            distanceMatrix[newRow][newCol] = newDist;
            previousNodes[newRow][newCol] = node;
            priorityQueue.push({
              node: {
                row: newRow,
                col: newCol,
                element: gridContainer.querySelector(
                  `[data-row='${newRow}'][data-col='${newCol}']`
                ),
              },
              dist: newDist,
            });
          }
        }
      }
    }
    return null;
  }

  function animatePath(path) {
    path.forEach((node, index) => {
      setTimeout(() => {
        if (node !== startCell && node !== endCell) {
          node.element.classList.add("path");
        }
      }, 50 * index);
    });
  }
});

