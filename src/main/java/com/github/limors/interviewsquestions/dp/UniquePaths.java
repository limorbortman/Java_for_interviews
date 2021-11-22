package com.github.limors.interviewsquestions.dp;

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 *
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *
 * How many possible unique paths are there
 *
 * Constraints:
 *
 * 1 <= m, n <= 100
 * It's guaranteed that the answer will be less than or equal to 2 * 109.
 */
public class UniquePaths {

    public static int uniquePaths(int m, int n) {
        int[][] cache = new int[m][n];

        for(int i =0; i< m ; i++){
            for(int j =0; j < n; j++){
                cache[i][j] =  (i == 0 || j ==0) ? 1 : cache[i-1][j] + cache[i][j-1];
            }
        }
        return cache[m-1][n-1];

    }

}
