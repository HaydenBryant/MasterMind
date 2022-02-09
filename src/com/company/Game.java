package com.company;

public class Game {
    private Board board;

    public void game(){
        Board board = new Board(){};
        board.generateRandomBoard(4);

        board.toString();
        System.out.println(board);
    }
}
