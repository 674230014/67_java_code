import java.util.Scanner;
public class W05_test1_674230014{
    public static void main(String[]area){
        System.out.println("ชื่อ ชิษณุพงศ์ พุทธา ID:674230014");
        Scanner sc = new Scanner(System.in);
        System.out.print("ความยาวเส้นแทยงมุม1 : ");
        int แทยง1 = sc.nextInt();
        System.out.print("ความยาวเส้นแทยงมุม2 : ");
        int แทยง2 = sc.nextInt();
        System.out.print("พื้นที่ = "+(แทยง1*แทยง2)/2);
    }
}