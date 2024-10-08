import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(" " +a +b +c);
        double d = (b*b) - 4*a*c;
        if (d<0) {
            System.out.println("вещественных корней нет");
        }
        else {
            System.out.println("вещественные корни есть");

        }


    }
}