package com.company;

public class Main {

    public static void main(String[] args) {

        boolean teenChecker = checkTeen(13, 11, 33);
        theAnswer(teenChecker);

    }

    public static boolean checkTeen(int num1, int num2, int num3) {

        boolean answer = false;

        if((num1 >= 13) && (num1 <= 19)) {
            answer = true;
        } else if((num2 >= 13) && (num2 <= 19)) {
            answer = true;
        } else if((num3 >= 13) && (num3 <= 19)) {
            answer = true;
        }

        return answer;
    }

    public static void theAnswer(boolean answer) {
        System.out.println(answer);
    }

}
