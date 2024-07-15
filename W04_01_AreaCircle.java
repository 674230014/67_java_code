import java.util.Scanner;
public class W04_01_AreaCircle{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนค่ารัศมีวงกลม: ");
        double radius = sc.nextDouble();
        double area=0;             
        double PI=3.14159;
        if(radius>0) {
           area = PI*radius*radius;
           System.out.println("พื้นที่วงกลมที่มีรัศมี = "+radius+" คือ "+area);
        } else {
            System.out.println("กรุณาใส่ตัวเลขที่มากกว่า0");
        }        
    }
}