package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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

    public int getBoardSize(){
        return board.size();
    }

    public void generateRandomBoard(int size){
        ArrayList<ColorPeg> newBoard = new ArrayList<>();
        for (int i = 0; i < size; i++){
            ColorPeg colorPeg = new ColorPeg();
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
