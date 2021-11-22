package com.github.limors.interviewsquestions.stream;

import com.github.limors.interviewsquestions.stream.GridChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.github.limors.interviewsquestions.stream.GridChallenge.YES_RESULT;

class GridChallengeTest {

    @Test
    void withSortedColumns(){
        Assertions.assertEquals(GridChallenge.YES_RESULT, GridChallenge.gridChallenge(List.of("abc", "lmp", "qrt")));
    }

    @Test
    void withoutSortedColumns(){
        Assertions.assertEquals(GridChallenge.NO_RESULT, GridChallenge.gridChallenge(List.of("mpxz", "abcd", "wlmf")));
    }

    @Test
    void emptyList(){
        Assertions.assertEquals(GridChallenge.YES_RESULT, GridChallenge.gridChallenge(List.of()));
    }

}