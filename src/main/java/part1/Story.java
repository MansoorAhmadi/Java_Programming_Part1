package part1;

import java.util.Scanner;

public class Story {
    public static void main(String[] args) {

//        Question
//NB! The example output might align wrong on narrow displays. If you're using only a limited portion of the browser window,
// or your display is otherwise very narrow, try to stretch the display horizontally to see if the text aligns differently.
// The exercise expects the text to align as it does on wider displays.
//
//Write a program that asks the user for a character's name and their job. The program then prints a short story.
//
//The output must be as shown below — note, the name and job depend on the user's input.

        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String characterName = scanner.nextLine();
//        System.out.println(character);

        System.out.println("What is their job?");
        String characterJob = scanner.nextLine();
//        System.out.println(charactersJob);

        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + characterName + ", who was " + characterJob + ".");
        System.out.println("On the way to work, " + characterName + " reflected on life.");
        System.out.println("Perhaps " + characterName + " will not be " + characterJob + " forever.");
//
//I will tell you a story, but I need some information first.
//What is the main character called?
//Ada
//What is their job?
//a Data scientist
//Here is the story:
//Once upon a time there was Ada, who was a Data scientist.
//On the way to work, Ada reflected on life.
//Perhaps Ada will not be a Data scientist forever.
    }
}
