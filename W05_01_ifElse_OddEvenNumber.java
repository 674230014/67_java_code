import java.util.Scanner;
public class W05_01_ifElse_OddEvenNumber{
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int Number = sc.nextInt();
        int result = Number%2;
        if(result==0){
            System.out.print(Number+" is an even number");
        } else{
            System.out.print(Number+" is an odd number");
        }
    }
}