package S674230014_01_myTest;
import java.util.Scanner;
public class Test_674230014_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณาใส่จำนวนเต็ม : ");
        int number = sc.nextInt();
        if (number>0) {
            System.out.println(number+" เป็นจำนวนเต็มบวก");
        }else if(number<0){
            System.out.println(number+" เป็นจำนวนเต็มลบ");
        }else{
            System.out.println("กรุณาใส่ใหม่");
        }
    }
}
