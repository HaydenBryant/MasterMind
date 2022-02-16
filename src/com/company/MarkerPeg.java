package com.company;

import java.util.Comparator;

public class MarkerPeg {
    private String color;

    public MarkerPeg(String color){
        this.color = color;
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

    public static Comparator<MarkerPeg> MarkColorComparator = new Comparator<MarkerPeg>() {
        @Override
        public int compare(MarkerPeg marker1, MarkerPeg marker2) {
            String color1 = marker1.getColor();
            String color2 = marker2.getColor();

            return color1.compareTo(color2);
        }
    };
}
