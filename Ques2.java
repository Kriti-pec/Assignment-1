import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input first number: ");
        float num1 = s.nextFloat();
        System.out.print("Input second number: ");
        float num2 = s.nextFloat();  
        s.close();
        float multiplying_of_num1_and_num2 = num1*num2;
        System.out.println("Multiplication of num1 and num2: "+multiplying_of_num1_and_num2);
       
     }
}
