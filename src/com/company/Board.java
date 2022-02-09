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

    public void generateRandomBoard(){
        ArrayList<String> colorList = new ArrayList<>(Arrays.asList(
                "green", "red", "blue", "yellow", "orange"
        ));
        ArrayList<ColorPeg> newBoard = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < this.getBoardSize(); i++){
            String randomElement = colorList.get(rand.nextInt(colorList.size()));
            ColorPeg colorPeg = new ColorPeg(randomElement, i);
            newBoard.add(colorPeg);
        }
    }
}
