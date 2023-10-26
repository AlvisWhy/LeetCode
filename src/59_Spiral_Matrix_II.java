class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int x = 0, y = 0;
        int temp = n-1;
        int count = 0;
        for (int i=1; i <= n*n; i++) {
            if (count == 4 * temp) {
                temp -= 2;
                count = 0;
                if (temp <= 0){
                    break;
                }
                x += 1;
            }
            if (0<=count && count<temp) {
                res[y][x] = i;
                x += 1;
            }
            else if (temp<=count && count<2*temp) {
                res[y][x] = i;
                y+=1;
            }
            else if ( 2 *temp<=count && count<3*temp) {
                res[y][x] = i;
                x -= 1;
            }
            else {
                res[y][x] = i;
                if (count != 4 * temp - 1){
                y -= 1 ;
                }
            }
            count += 1;
        }
        if (n%2 == 1){
            res[n/2][n/2] = n*n;
        }
        return res;
    }
}
