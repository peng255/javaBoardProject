package org.example;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        String input = """
                작성
                제목1
                내용1
                작성
                제목2
                내용2
                목록
                조회
                1번
                삭제
                1번
                목록
                종료
                """;

        // 2. System.in을 가짜 입력값으로 변경
        InputStream testInput = new ByteArrayInputStream(input.getBytes());
        System.setIn(testInput); // System.in을 변경하여 Scanner가 읽도록 함

        Consol consol = new Consol();
        consol.run();
    }
}


