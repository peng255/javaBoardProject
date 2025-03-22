package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class ConsolTest {

    @Test
    @DisplayName("보드.글생성 테스트")
    void test1() throws Exception {
        // 가짜 입력 데이터 준비 ("작성\n제목1\n내용1\n종료\n")
        String input = "작성\n제목1\n내용1\n작성\n제목2\n내용2\n목록\n" +
                "삭제\n1번\n조회\n1번\n목록\n종료\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Consol consol = new Consol();
        consol.run();
    }

}