package W13;
import java.util.Scanner;
public class W13_02_introArray {
    public static void main(String[] args) {
        //การประกาศตัวแปรชนิด Array แบบที่ 2 - ไม่รู้จำนวนข้อมูลล่วงหน้า
        String [] brandCars = new String[3];
        
        Scanner kb = new Scanner(System.in);
        //กำหนดค่าให้กับ Array
        brandCars[0] = "Toyota";
        brandCars[3] = "Honda";
        brandCars[9] = "Nissan";

        //แสดงผลโดยใช้ Loop
        System.out.println("Brands of cars in the array are : ");
        for(int i=0;i<10;i++){
            System.out.print(brandCars[i] + " / ");
        }
        
        //แก้ไขค่าใน Array โดยรับค่าจากคีบอร์ด
        System.out.println("\n\nPlease enter the brand of the 3rd car : ");
        for(int i=0;i<brandCars.length;i++){
            System.out.println("Enter brand " + (i+1) + ": ");
            brandCars[i] = kb.next();
        }

        System.out.println("\nBrands of cars in the array are : ");
        for(String car : brandCars){
        System.out.print(car + " / ");
        }
    }
}