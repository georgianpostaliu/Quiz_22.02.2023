package com.example.Quiz;

import java.util.Scanner;

public class Quiz {

    private String[] questions = {"What is a baby koala called?","Why does a koala sometimes scream like a baby?",
    "What is the koala's closest relative?","Male and female koalas mature at different rates?",
    "Koalas are marsupials. What does this mean?"};
    private String[][] options = {{"Foal", "Pup", "Cub", "Joey"},
                                  {"it feels hungry", "it is happy", "it is annoyed", "it is scared"},
                                  {"wombat", "weasel", "mole", "groundhog"},
                                  {"true", "false"},
                                  {"none of these", "Koalas lives only by eating plants", "Koalas have a pouch to " +
                                  "carry " + "their young", "Koalas live only in trees"}};
    private char[] answers = {'D', 'D', 'A', 'A', 'C'};
    private int score = 0;


    public String[] getQuestions() {
        return questions;
    }
    public String[][] getOptions() {
        return options;
    }
    public  char[] getAnswers() {
        return answers;
    }
    public int getScore(){
        return score;
    }

    public void setQuestions(String[] questions){
        this.questions = questions;
    }
    public void setOptions(String[][] options){
        this.options = options;
    }
    public void setAnswers(char[] answers){
        this.answers = answers;
    }
    public void setScore(int score){
        this.score = score;
    }

    public void QuizMethod () {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
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
        System.out.println("Quiz completed! Your score is " + score + " out of " + questions.length);
    }
}
