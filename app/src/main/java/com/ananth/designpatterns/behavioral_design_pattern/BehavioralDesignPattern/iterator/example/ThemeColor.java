package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.iterator.example;

//This enum represents the aggregate from the iterator pattern.
public enum ThemeColor {
    RED,
    ORANGE,
    BLACK,
    WHITE;

    public static Iterator<ThemeColor> getIterator(){
        return new ThemeColorIterator();
    }
    private static class ThemeColorIterator implements Iterator<ThemeColor>{

        private int position;

        @Override
        public boolean hasNext() {
            return position<ThemeColor.values().length;
        }

        @Override
        public ThemeColor next() {
            return ThemeColor.values()[position++];
        }
    }
}
