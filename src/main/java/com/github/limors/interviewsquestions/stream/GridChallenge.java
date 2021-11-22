package com.github.limors.interviewsquestions.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending.
 * Determine if the columns are also in ascending alphabetical order, top to bottom. Return YES if they are or NO if they are not.
 */
public class GridChallenge {

    public final static String YES_RESULT = "YES";
    public final static String NO_RESULT = "NO";

    public static String gridChallenge(List<String> grid) {
        if(grid.size() ==0 ) {
            return YES_RESULT;
        }
        List<char[]> sortedGrid = new ArrayList<>();

        grid.forEach(row -> {
            char[] rowAsChars = row.toCharArray();
            Arrays.sort(rowAsChars);
            sortedGrid.add(rowAsChars);
        });
        return IntStream.range(0, grid.get(0).length())
                .allMatch(i -> isSortedColumn(i, sortedGrid)) ? YES_RESULT : NO_RESULT;
    }

    private static boolean isSortedColumn(int column, List<char[]> sortedGrid) {
        return IntStream.range(1, sortedGrid.get(0).length)
                .allMatch(i -> sortedGrid.get(i)[column] >= sortedGrid.get(i - 1)[column]);
    }
}
