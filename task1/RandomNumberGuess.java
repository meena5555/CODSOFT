import java.util.Scanner;
import java.util.Random;
public class RandomNumberGuess {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("Well, "+name + ", I am thinking of a number between 1 and 20!");
        int myNumber = getRandomNumber(1, 21);

        for (int i=0;i<6;i++){

            Scanner scan2 = new Scanner(System.in);
            System.out.println("Take a guess??");
            int yourGuess = scan2.nextInt();

            if (yourGuess == myNumber){
                System.out.println("You guessed correctly!");
                break;
            }
            else if(yourGuess < myNumber){

                System.out.println("Your guess is too low!");
            }
            else if(yourGuess > myNumber){
                System.out.println("Your guess is too high!");
            }
            if(i >= 5){

                System.out.println();
                System.out.println("Nope. The number I was thinking of was " + myNumber + "!");
            }
        }
    }

    public static int getRandomNumber(int min, int max){

        Random random = new Random();
        return random.ints(min,max).findFirst().getAsInt();

    }
}