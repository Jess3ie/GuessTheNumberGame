import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() *100) +1;
        boolean hasWon = false;
        System.out.println("I have randomly chosen a number between [1 , 100]");
        System.out.println("Try to guess it.");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--){
            System.out.println("You have " + i + " guess(es) left. Enter guess");
            int guess = scanner.nextInt();
            if (randomNumber < guess) {
                System.out.println("It's smaller than " + guess + ".");
            }
            if (randomNumber > guess) {
                System.out.println("It's greater than " + guess + ".");
            }
            if (randomNumber == guess){
                hasWon =  true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Correct... You WIN!!");
        } else {
            System.out.println("Game Over, you LOSE!!");
            System.out.println("The number was " + randomNumber);
        }




    }
}
