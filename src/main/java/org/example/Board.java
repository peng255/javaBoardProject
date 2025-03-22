package org.example;

import java.util.LinkedList;


public class Board {
    private LinkedList<Article> articleList = new LinkedList<>();;
    private static int lastId = 0;


    public int getBoardSize(){
        return articleList.size();
    }

    public void addArticle(String title, String body) {
        Article article = new Article(++lastId, title, body);
        articleList.add(article);
    }

    public boolean checkArticle(int id){
        for(Article a : articleList) {
            if (a.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean printArticle(int id) {
        for(Article a : articleList){
            if(a.getId() == id){
                System.out.println(a.getId() + "번 게시물");
                System.out.println("제목 : " + a.getTitle());
                System.out.println("내용 : " + a.getBody());
                return true;
            }
        }
        return false;
    }

    public boolean removeArticle(int id) {
        Article article;
        for(Article a : articleList){
            if(a.getId() == id){
                article = a;
                articleList.remove(article);
                return true;
            }
        }
        return false;
    }

    public void printBoard(){
        for(Article a : articleList){
            System.out.println();
            System.out.println(a.getId() + "번 게시물");
            System.out.println("제목 : " + a.getTitle());
            System.out.println("내용 : " + a.getBody());
        }
    }

    public void editArticle(int id, String title, String body) {
        for(Article a : articleList){
            if(a.getId() == id){
                a.setTitle(title);
                a.setBody(body);
                return;
            }
        }
    }
}
