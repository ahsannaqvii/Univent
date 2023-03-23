function calculatePaths(matrix, i, j, rows, columns) {
  let pathCount = 0;
  let paths = [];

  let visited = Array(rows)
    .fill()
    .map(() => Array(columns).fill(0));
  calculatePathsUtil(matrix, visited, i, j, rows, columns, []);
  //   console.log("pathCount", pathCount);
  return paths;
  function calculatePathsUtil(
    matrix,
    visited,
    i,
    j,
    rows,
    columns,
    currentpath
  ) {
    // console.log("i", i, "j", j);
    if (i < 0 || i >= rows || j < 0 || j >= columns) return;
    if (matrix[i][j] === 1 || visited[i][j] === 1) return;
    if (i === rows - 1 && j === columns - 1) {
      pathCount++;
      //   console.log("found a path");
      paths.push([...currentpath]);
      visited[i][j] = 0;
      return;
    }
    visited[i][j] = 1;
    //up
    currentpath.push([i - 1, j]);
    calculatePathsUtil(matrix, visited, i - 1, j, rows, columns, currentpath);
    currentpath.pop();

    //down
    currentpath.push([i + 1, j]);
    calculatePathsUtil(matrix, visited, i + 1, j, rows, columns, currentpath);
    currentpath.pop();
    //right
    currentpath.push([i, j + 1]);
    calculatePathsUtil(matrix, visited, i, j + 1, rows, columns, currentpath);
    currentpath.pop();
    //left
    currentpath.push([i, j - 1]);
    calculatePathsUtil(matrix, visited, i, j - 1, rows, columns, currentpath);
    currentpath.pop();

    visited[i][j] = 0;

    return;
  }
}
