package com.company;

import java.util.ArrayList;


public class Board {
    private ArrayList<ColorPeg> board;

    public Board() {
        this.board = new ArrayList<ColorPeg>();
    }

    public ArrayList<ColorPeg> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<ColorPeg> board) {
        this.board = board;
    }

    public void generateRandomDuplicateBoard(int size){
        ArrayList<ColorPeg> newBoard = new ArrayList<>();
        for (int i = 0; i < size; i++){
            ColorPeg colorPeg = new ColorPeg();
            newBoard.add(colorPeg);
        }

        this.board = newBoard;
    }

    public void generateRandomBoard(int size){
        ArrayList<ColorPeg> newBoard = new ArrayList<>();
        ColorPeg firstPeg = new ColorPeg();
        newBoard.add(firstPeg);
        Boolean samePeg = false;

        for (int i = 1; i < size; i++){
            ColorPeg colorPeg = new ColorPeg();
            for(ColorPeg peg : newBoard){
                if(colorPeg.getColor().equals(peg.getColor())){
                    samePeg = true;
                    break;
                }
            }
            if (samePeg){
                i--;
                samePeg = false;
                continue;
            }
            newBoard.add(colorPeg);
        }

        this.board = newBoard;
    }

    @Override
    public String toString() {
        String output = "";

        for (ColorPeg peg : board){
            output += peg.toString() + ", ";
        }

        return output.substring(0, output.length() - 2);
    }
}
