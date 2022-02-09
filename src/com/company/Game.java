package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private Board board;

    public void game(){
        Board board = new Board(){};
        board.generateRandomBoard(4);
        Scanner scan = new Scanner(System.in);

        ArrayList<String> ansList = new ArrayList<>();

        System.out.println(board.toString());

        for(int i = 0; i < 4; i++){
            System.out.println("Guess color of peg " + (i + 1) + ". ");
            String ans = scan.nextLine().toLowerCase();
            ansList.add(ans);
        }

        Boolean correct = true;
        for(int i = 0; i < 4; i++){
            if(ansList.get(i).equals(board.getBoard().get(i).getColor())){
                continue;
            } else {
                correct = false;
                break;
            }
        }

        if (correct){
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }
}
