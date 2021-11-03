package day03;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100);
        for (int i = 1; i <= 6; i++) {
            System.out.println("Your number?");
            Scanner scanner = new Scanner(System.in);
            int yourNumber = scanner.nextInt();
            if (yourNumber < randomNumber){
                System.out.println("Your number is smaller than mine.");
            }
            else if (yourNumber > randomNumber){
                System.out.println("Your number is bigger than mine.");
            }
            else{
                System.out.println("you have got it right!!!");
            }
        }
        System.out.println("My number is " + randomNumber);
    }
}
