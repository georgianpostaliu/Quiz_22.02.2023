package com.example.Quiz;

import java.util.Scanner;

// different classes ex: logic-in, game engine, questions(doar atribute, contine intrebare, optiuniuni, answer), set
// getter
public class Quiz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String[] quiz = new String[5];
        quiz[0] = " What is a baby koala called?";
        quiz[1] = " Why does a koala sometimes scream like a baby?";
        quiz[2] = " What is the koala's closest relative?";
        quiz[3] = " Male and female koalas mature at different rates?";
        quiz[4] = " Koalas are marsupials. What does this mean?";
        //quiz[5] = " Koalas' fur is like wool?\n";
        //quiz[6] = " What is NOT true about koalas?\n";
        //quiz[7] = " Although the koala is nocturnal, do they hunt prey at night?\n";
        //quiz[8] = " What does the disease conjunctivitis affect on the koala?\n";
        //quiz[9] = " In Australia in the early 1920s why were koalas dying so rapidly?\n";

        String[][] options = {{"Foal", "Pup", "Cub", "Joey"},
                              {"it feels hungry", "it is happy", "it is annoyed", "it is scared"},
                              {"wombat", "weasel", "mole", "groundhog"},
                              {"true", "false", "", ""},
                              {"none of these", "Koalas lives only by eating plants", "Koalas have a pouch to carry " +
                               "their young", "Koalas live only in trees"}};
        char[] answers = {'D', 'D', 'A', 'A', 'C'};

        for(int i = 0; i < quiz.length; i++) {
            System.out.println(quiz[i]);
            System.out.println("A) " + options[i][0]);
            System.out.println("B) " + options[i][1]);
            if (i != 3) {
                System.out.println("C) " + options[i][2]);
                System.out.println("D) " + options[i][3]);
            }
            System.out.print("Enter your choice: ");
            char userAnswer = scanner.nextLine().toUpperCase().charAt(0);
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("Quiz completed! Your score is " + score + " out of " + quiz.length);
    }
}
