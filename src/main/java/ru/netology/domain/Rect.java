package ru.netology.domain;

public class Rect {
    private int x1, y1;
    private int x2, y2;
    private static final int MAX_COORD = 1000;

    private boolean isCorrect(int arg) {
        return (0 <= arg && arg <= MAX_COORD);
    }

    void setCoords(int x1, int y1, int x2, int y2) {
        if (isCorrect(x1) && isCorrect(y1) && isCorrect(x2) && isCorrect(y2)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

        public int getX1 () {
            return x1;
        }
        public int getX2 () {
            return x2;
        }
        public int getY1 () {
            return y1;
        }
        public int getY2 () {
            return y2;
        }


    /**Rect( int x1, int y1, int x2, int y2){
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }*/
        int square () {
            return Math.abs(x1 - x2) * Math.abs(y1 - y2);
        }


    }


