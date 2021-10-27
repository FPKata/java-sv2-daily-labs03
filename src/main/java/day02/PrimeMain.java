package day02;

public class PrimeMain {
    public static void main(String[] args) {
        Mathematics number = new Mathematics(0);
        boolean answer = number.isPrime();
        if (answer){
            System.out.println("Your number is prime.");
        }
        else{
            System.out.println("Your number is not prime.");
        }
    }
}

