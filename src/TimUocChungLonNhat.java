import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a, b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = nhap.nextInt();
        System.out.println("Enter b: ");
        b = nhap.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        while (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
            System.out.println("Enter a: ");
            a = nhap.nextInt();
            System.out.println("Enter b: ");
            b = nhap.nextInt();
            a = Math.abs(a);
            b = Math.abs(b);
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
