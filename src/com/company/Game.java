package com.company;

public class Game {
    private Board board;

    public void game(){
        Board board = new Board(){};
        board.generateRandomBoard();

        System.out.println(board);
    }
}
