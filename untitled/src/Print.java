import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll and name: ");

        int roll = sc.nextInt();
        String name = sc.next();

        System.out.println("roll:" + roll);
        System.out.println("Name:" + name);

        sc.close();
    }
}
