package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private Board board;
    Scanner scan = new Scanner(System.in);

    public void game(){
        Board ansBoard = new Board(){};
        ansBoard.generateRandomBoard(4);
//        System.out.println(ansBoard.toString());

        Board guessBoard = guessBoard();

        if (checkBoard(guessBoard, ansBoard)){
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }

    public Board guessBoard(){
        ArrayList<ColorPeg> ansList = new ArrayList<>();
        Board guessBoard = new Board();

        for(int i = 0; i < 4; i++){
            System.out.println("Guess color of peg " + (i + 1) + ". ");
            String ans = scan.nextLine().toLowerCase();
            ColorPeg colorPeg = new ColorPeg(ans);
            ansList.add(colorPeg);
        }
        guessBoard.setBoard(ansList);
        return guessBoard;
    }

    public Boolean checkBoard(Board guessBoard, Board ansBoard){

        for(int i = 0; i < 4; i++){
            String guessColor = guessBoard.getBoard().get(i).getColor();
            String ansColor = ansBoard.getBoard().get(i).getColor();
            if(!guessColor.equals(ansColor)){
                return false;
            }
        }

        return true;
    }
}
