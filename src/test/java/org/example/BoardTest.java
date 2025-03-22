package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    @DisplayName("보드.글생성 테스트")
    void test1() throws Exception {

        Board board = new Board();
        board.addArticle("hh", "aa");
        board.printArticle(1);

    }

}