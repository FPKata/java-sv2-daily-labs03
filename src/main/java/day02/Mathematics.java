package day02;

public class Mathematics {
    private double number;

    public Mathematics(double number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number < 2) {
            return false;
        }
        int countOfNumber = 2;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                countOfNumber++;
            }
        }
        if (countOfNumber > 2) {
            return false;
        }
            return true;
    }
}