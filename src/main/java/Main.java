import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToGuess = "dress";
        char[] guessedWord = new char[wordToGuess.length()];

        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int attemptsLeft = 6;

        while (attemptsLeft > 0) {
            System.out.println("Word: " + String.valueOf(guessedWord));
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.print("Enter a letter: ");

            char guess = scanner.next().charAt(0);

            boolean correctGuess = false;

            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                attemptsLeft--;
                System.out.println("Incorrect guess.");
            } else {
                System.out.println("Good guess!");
            }

            if (String.valueOf(guessedWord).equals(wordToGuess)) {
                System.out.println("Congratulations! You guessed the word: " + wordToGuess);
                break;
            }
        }

        if (attemptsLeft == 0) {
            System.out.println("Sorry, you ran out of attempts. The word was: " + wordToGuess);
        }

        scanner.close();
    }
}



