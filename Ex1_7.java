import java.util.Scanner;
public class Ex1_7 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);        

        System.out.println("숫자를 입력하세요"); 
        int num1 = scanner.nextInt(); //숫자 입력1

        System.out.println("더할 숫자를 입력하세요"); 
        int num2 = scanner.nextInt(); //숫자 입력2

        System.out.println("값은 : " + (num1 + num2));

     
        scanner.close();

    }
}
