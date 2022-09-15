import java.util.Scanner;
class Ques1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = s.nextInt();
        System.out.print("Input second number: ");
        int num2 = s.nextInt();  
        s.close();
        int addition_of_num1_and_num2 = num1 + num2;
        System.out.println("Addition of num1 and num2: " + addition_of_num1_and_num2);
        int subtraction_of_num1_and_num2 = num2 - num1;
        System.out.println("Subtraction of num1 from num2: " + subtraction_of_num1_and_num2);
    }
}
