class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] newMat = new int [r][c];
        int count = 0,  x = -1, y = 0;
        for (int i=0; i<m; i++) {
            for (int j=0 ; j<n; j++, count++) {
                y = count % c;
                if(y == 0){
                    x++;
                }
                newMat[x][y] = mat[i][j];
            }
        }
        return newMat;
    }
}