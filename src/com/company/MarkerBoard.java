package com.company;

import java.util.ArrayList;

public class MarkerBoard {
    private ArrayList<MarkerPeg> markerBoard;

    public MarkerBoard(){
        this.markerBoard = new ArrayList<>();
    }

    public ArrayList<MarkerPeg> getMarkerBoard() {
        return markerBoard;
    }

    public void setMarkerBoard(ArrayList<MarkerPeg> markerBoard) {
        this.markerBoard = markerBoard;
    }

    @Override
    public String toString() {
        String output = "";

        for (MarkerPeg peg : markerBoard){
            output += peg.toString() + ", ";
        }

        return output.substring(0, output.length() - 2);
    }
}
