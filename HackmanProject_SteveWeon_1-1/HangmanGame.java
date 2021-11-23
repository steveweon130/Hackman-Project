import java.util.*;

public class HangmanGame {
    public static void main (String[] args) {
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        HangingMan hangingMan = new HangingMan();
        Puzzle puzzle = new Puzzle();
        
        while (puzzle.isUnsolved() && hangingMan.isntDead()) {
            System.out.println("Russian Hangman:");
            System.out.println("The cylinder of revolver rotates clockwise everytime you guess wrong.");
            System.out.println("Guess the word before the bullet gets chambered and fired.\n");
            hangingMan.show();
            puzzle.show();
            System.out.print("\nMake a guess: ");
            String guess = scanner.nextLine();
            if (!puzzle.makeGuess(guess)) {
                hangingMan.dieSomeMore();
            }
            clearScreen();
        }
        
        if (hangingMan.isntDead()) {
            System.out.print("You win! Congrats! The word was \"" + puzzle.getWord() + "\"\n＼(^o^)／" );
        } else {
            System.out.println("You lose! The word was \"" + puzzle.getWord() + "\"\n   ");
            System.out.print("/̵͇̿̿/'̿̿ ̿̿ ̿̿  ҉        \\(˚☐˚”)/");
        }
    }
    
    public static void clearScreen() {
        System.out.println("\f");
    }
}

