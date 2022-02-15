package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ColorPeg {
    private String color;

    public ColorPeg(String color){
        this.color = color;
    }

    public ColorPeg(){
        ArrayList<String> colorList = new ArrayList<>(Arrays.asList(
                "green", "red", "blue", "yellow", "orange", "purple"
        ));

        Random rand = new Random();

        this.color = colorList.get(rand.nextInt(colorList.size()));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
