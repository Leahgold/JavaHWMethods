import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите два числа через пробел");
        Scanner scanner = new Scanner(System.in);

        double left = scanner.nextDouble();
        double right = scanner.nextDouble();

        double sum = sum(left, right);
        System.out.println("sum = " + sum);
        double sbt = sbt(left, right);
        System.out.println("sbt = " + sbt);
        double mlt = sbt(left, right);
        System.out.println("mlt = " + mlt);
        double pwr = sbt(left, right);
        System.out.println("pwr = " + pwr);
    }

    static double sum(double left, double right) {
        return left + right;

    }

    static double sbt(double left, double right) {
        return left - right;

    }

    static double mlt(double left, double right) {
        return left * right;

    }


    static double pwr(double left) {
        return left * left;

    }
}
