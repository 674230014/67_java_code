import java.util.Scanner;
public class W05_02_ifElseIf_PosNegZero{
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        if(number>0){
            System.out.print(number+" is a positive number.");
        }else if(number<0){
            System.out.print(number+" is a nagative number.");
        }else{
            System.out.print(number+" is a zero.");
        }
    }
}