package com.example.Quiz;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String[] questions = {"What is the capital of France?", "What is the largest ocean in the world?", "Who is the author of the Harry Potter series?"};
        String[][] options = {{"Paris", "London", "New York"}, {"Atlantic Ocean", "Pacific Ocean", "Indian Ocean"},{"Stephen King", "J.K. Rowling", "Dan Brown"}};
        char[] answers = {'A','B','B'};
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("A) " + options[i][0]);
            System.out.println("B) " + options[i][1]);
            System.out.println("C) " + options[i][2]);
            System.out.print("Enter your choice: ");
            char userAnswer = scanner.nextLine().toUpperCase().charAt(0);
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("Quiz completed! Your score is " + score + " out of " + questions.length);
    }
}
