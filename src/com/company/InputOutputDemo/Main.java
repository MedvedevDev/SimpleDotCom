package com.company.InputOutputDemo;

public class Main {

    public static void main(String[] args) {
        int numOfGuesses = 0;

        GameHelper gh = new GameHelper();

        DotCom dot = new DotCom();

        int randNum = (int) (Math.random()*5);

        int[] locations = {randNum, randNum+1, randNum+2};

        dot.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {
            String guess = gh.getUserInput("Input");
            String result = dot.checkYourself(guess);

            numOfGuesses++;

            if (result.equals("Gotit")){
                isAlive = false;
                System.out.println("Num of guesses " + numOfGuesses);
            }
        }

    }
}
