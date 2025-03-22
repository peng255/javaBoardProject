package org.example;

import java.util.Scanner;

public class Consol {
    Scanner scanner = new Scanner(System.in);
    Board board = new Board();

    public void run(){
        while(true){
            System.out.print("명령어 > ");
            String s = scanner.nextLine().trim();
            System.out.println(s);

            switch (s){
                case "종료":
                    System.out.println("프로그램이 종료됩니다.");
                    return;

                case "작성":
                    System.out.println("게시글을 작성합니다.");
                    System.out.print("제목: ");
                    String title = scanner.nextLine().trim();
                    System.out.print("내용: ");
                    String body = scanner.nextLine().trim();
                    board.addArticle(title, body);
                    System.out.print("\n\n");
                    break;

                case "조회":
                    System.out.print("어떤 게시물을 조회할까요? (예: 1번) \n");
                    String input = scanner.nextLine().trim();
                    int id = Integer.parseInt(input.substring(0, input.length()-1));
                    if(! board.printArticle(id)) {
                        System.out.println(input + " 게시글은 존재하지 않습니다.");
                    }
                    System.out.println();
                    break;

                case "삭제":
                    System.out.printf("어떤 게시물을 삭제할까요? (예: 1번) \n");
                    input = scanner.nextLine().trim();
                    id = Integer.parseInt(input.substring(0, input.length()-1));
                    if(board.removeArticle(id)){
                        System.out.println(input + " 게시물이 성공적으로 삭제되었습니다!");
                    }else{
                        System.out.println(input + " 게시글은 존재하지 않습니다.");
                    }
                    System.out.println();
                    break;

                case "수정":
                    System.out.printf("어떤 게시물을 수정할까요? (예: 1번) \n");
                    input = scanner.nextLine().trim();
                    id = Integer.parseInt(input.substring(0, input.length()-1));
                    if (! board.checkArticle(id)){
                        System.out.println(input + " 게시물은 존재하지 않습니다.");
                        break;
                    }

                    System.out.println(input + " 게시물을 수정합니다.");
                    System.out.print("제목: ");
                    title = scanner.nextLine().trim();
                    System.out.print("내용: ");
                    body = scanner.nextLine().trim();
                    board.editArticle(id, title, body);
                    System.out.printf("\n" + input + " 게시물이 성공적으로 수정되었습니다!\n");
                    System.out.println();
                    break;

                case "목록":
                    System.out.printf("총 게시글은 " + board.getBoardSize() + "개 작성되어 있습니다.\n");
                    board.printBoard();
                    System.out.println();
                    break;


                default:
                    System.out.println("존재하지 않는 명령어 입니다.");
                    System.out.println();
                    break;
            }

        }
    }
}

