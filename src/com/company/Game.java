package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private Board board;
    Scanner scan = new Scanner(System.in);

    public void game(){
        controlRound(4);
    }

    public void controlRound(int boardSize){
        Board ansBoard = new Board(){};
        ansBoard.generateRandomBoard(boardSize);
        System.out.println(ansBoard.toString());

        for(int i = 0; i < 10; i++){
            Board guessBoard = guessBoard();
            MarkerBoard markerBoard = genMarkerBoard(guessBoard, ansBoard);

            if (checkBoard(markerBoard)) {
                System.out.println("Correct");
                break;
            } else {
                System.out.println("Wrong");
            }

            System.out.println("last guess was " + guessBoard.toString());
            System.out.println("Marker board is " + markerBoard.toString());
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

    public Boolean checkBoard(MarkerBoard markerBoard){

        for(int i = 0; i < 4; i++){
            String guessColor = markerBoard.getMarkerBoard().get(i).getColor();
            System.out.println(guessColor);
            if (!guessColor.equals("red")){
                return false;
            }
        }

        return true;
    }

    public MarkerBoard genMarkerBoard(Board guessBoard, Board ansBoard){
        MarkerBoard markerBoard = new MarkerBoard();

        ArrayList<MarkerPeg> markList = new ArrayList<>();

        for (int i = 0; i < 4; i++){
            ColorPeg guessPeg = guessBoard.getBoard().get(i);
            ColorPeg ansPeg = ansBoard.getBoard().get(i);
            if(guessPeg.getColor().equals(ansPeg.getColor())){
                MarkerPeg markerPeg = new MarkerPeg("red");
                markList.add(markerPeg);
                continue;
            } else if (ansBoard.getBoard().contains(guessPeg.getColor())){
                MarkerPeg markerPeg = new MarkerPeg("white");
                markList.add(markerPeg);
            } else {
                MarkerPeg markerPeg = new MarkerPeg("");
                markList.add(markerPeg);
            }
        }

        markerBoard.setMarkerBoard(markList);

        return markerBoard;
    }
}
