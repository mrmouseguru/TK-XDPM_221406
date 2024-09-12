import java.util.Scanner;

public class AppTinhTong {

    public static void main(String[] args) {
        calculateSum();
    }

    static void calculateSum(){
        //code
        int num1;
        int num2;
        int result = 0;
        Scanner input = null;
        input = new Scanner(System.in);
        System.out.print("Input num 1:");
        num1 = input.nextInt();
        System.out.print("Input num 2:");
        num2 = input.nextInt();

        //business rules
        result = num1 + num2;
        
        System.out.println("Result is: " + result);
    }

}
