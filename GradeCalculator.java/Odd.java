import java.util.Scanner;

class Odd {
    int x;

    void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
    }

    public static void main(String[] args) {
        Odd oddChecker = new Odd();
        oddChecker.read();
    }
}
