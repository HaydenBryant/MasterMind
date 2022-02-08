package com.company;

public class MarkerPeg {
    private String color;
    private int position;

    public MarkerPeg(String color, int position){
        this.color = color;
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
