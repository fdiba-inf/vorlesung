package lecture6;

import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = {"Fiki", "Malina", "Azis"};
        int maxErrors = 5;

        boolean playAgain = true;
        do {
            int randomIndex = new Random().nextInt(words.length);
            String word = words[randomIndex];
            int errors = 0;

            int nextEnteredLetterIndex = 0;
            int enteredLettersSize = word.length() + maxErrors;
            char[] enteredLetters = new char[enteredLettersSize];

            long startTime = System.currentTimeMillis();

            do {
                boolean wordFound = true;
                for (int index = 0; index < word.length(); index++) {
                    char letter = word.charAt(index);

                    boolean letterFound = false;
                    for (int i = 0; i < enteredLetters.length; i++) {
                        if (enteredLetters[i] == letter) {
                            letterFound = true;
                            break;
                        }
                    }

                    if (letterFound) {
                        System.out.print(" " + letter);
                    } else {
                        System.out.print(" _");
                        wordFound = false;
                    }
                }
                System.out.println();

                if (wordFound) {
                    break;
                }

                System.out.print("Enter letter: ");
                char enteredLetter = input.next().charAt(0);
                boolean letterFound = false;
                for (int i = 0; i <enteredLetters.length; i++) {
                    if (enteredLetters[i] == enteredLetter) {
                        letterFound = true;
                        break;
                    }
                }

                if (letterFound) {
                    continue;
                }

                enteredLetters[nextEnteredLetterIndex] = enteredLetter;
                nextEnteredLetterIndex++;

                boolean letterInWord = false;
                for (int index = 0; index < word.length(); index++) {
                    char letter = word.charAt(index);
                    if (letter == enteredLetter) {
                        letterInWord = true;
                        break;
                    }
                }

                if (!letterInWord) {
                    errors++;
                }

                System.out.println("Number of errors: " + errors);
            } while(errors < maxErrors);

            long endTime = System.currentTimeMillis();

            if (errors < maxErrors) {
                System.out.println("You win in " + (endTime - startTime));
            } else {
                System.out.println("You loose in " + (endTime - startTime));
            }

            System.out.print("Do you want to play again (y/n): ");
            char yesOrNo = input.next().charAt(0);
            if (yesOrNo == 'n') {
                playAgain = false;
            }
        } while(playAgain);

        System.out.println("Session end");
    }
}
