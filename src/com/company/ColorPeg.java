package com.company;

public class ColorPeg {
    private String color;
    private int position;
    private Boolean isCorrect;

    public ColorPeg(String color, int position){
        this.color = color;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public String getColor() {
        return color;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }
}
