package S674230014_01_myTest;
import java.util.Scanner;
public class Test_674230014_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณาใส่จำนวนเต็ม : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print(i+" ");
           sum = sum + i; 
      }
      System.out.println("ผลรวมตั้งแต่ 1 ถึง "+ num + " คือ " + sum);
    }
} 
