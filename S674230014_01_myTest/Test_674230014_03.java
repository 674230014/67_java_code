package S674230014_01_myTest;
import java.util.Scanner;
public class Test_674230014_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("กรุณาใส่จำนวนเต็ม 4 ค่า : ");
        System.out.print("ค่า 1 : ");
        int num1 = sc.nextInt();
        System.out.print("ค่า 2 : ");
        int num2 = sc.nextInt();
        System.out.print("ค่า 3 : ");
        int num3= sc.nextInt();
        System.out.print("ค่า 4 : ");
        int num4= sc.nextInt();
        if (num1>num2 && num1>num3 && num1>num4) {
            System.out.println("ค่ามากที่สุดคือ : " + num1);
        }else if(num2>num1 && num2>num3 && num2>num4){
            System.out.println("ค่ามากที่สุดคือ : " + num2);
        }else if(num3>num1 && num3>num2 && num3>num4){
            System.out.println("ค่ามากที่สุดคือ : " + num3);
        }else if(num4>num1 && num4>num2 && num4>num3){
            System.out.println("ค่ามากที่สุดคือ : " + num4);
        }else{
            System.out.println("ค่าทั้งหมดเท่ากัน");
        }
    }
}
