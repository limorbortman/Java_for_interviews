package com.github.limors.interviewsquestions.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UniquePathsTest {

    @Test
    void happyPath() {
        Assertions.assertEquals(3, UniquePaths.uniquePaths(3,2));
    }

    @Test
    void oneCellBord() {
        Assertions.assertEquals(1, UniquePaths.uniquePaths(1,1));
    }

    @Test
    void oneRowBord() {
        Assertions.assertEquals(1, UniquePaths.uniquePaths(1,5));
    }

    @Test
    void oneColumnBord() {
        Assertions.assertEquals(1, UniquePaths.uniquePaths(1,5));
    }

}