import java.util.Scanner;

public class p01_Square_Area {
    public static void main(String[] args) {
        System.out.println("Please specify the length of the square a=");
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double area = a * a;
        ;
        System.out.println("Square = " + area);


    }
}
