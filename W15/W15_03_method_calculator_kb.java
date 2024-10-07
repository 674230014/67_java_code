package W15;

import java.util.Scanner;

public class W15_03_method_calculator_kb {


    // ทั้งหมดเป็น method ที่มีการรับค่าและคืนค่า
    // 1) Method สำหรับบวกเลข
       static int plus(int a, int b){
            //System.out.println(a + " + " + b + " = " + (a+b));
            return a+b;
       }
    // 2) Method สำหรับลบเลข
        static int minus(int a, int b){
            System.out.println(a + " - " + b + " = " + (a-b));
            return a-b;
        }

    // 3) Method สำหรับคูณเลข
        static int multiply(int a, int b){
            System.out.println(a + " x " + b + " = " +  (a*b));
            return a*b;
        }

    // 4) Method สำหรับหารเลข
        static int divide(int a, int b){
            System.out.println(a + " % " + b + " = " + (a/b));
            return a/b;
        }

    public static void main(String[] args) {

        //  รับค่าจากคีย์บอร์ดก่อนส่งไปยัง method อื่น
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนตัวเลขตัวที่ 1: ");
        int a = sc.nextInt();
        System.out.print("ป้อนตัวเลขตัวที่ 2: ");
        int b = sc.nextInt();

        // 1) Method สำหรับบวกเลข
        System.out.println(a + " + " + b + " = " + plus(a,b));

        // 2) Method สำหรับลบเลข
        System.out.println(a + " + " + b + " = " + minus(a,b));

        // 3) Method สำหรับคูณเลข
        System.out.println(a + " + " + b + " = " + multiply(a,b));

        // 4) Method สำหรับหารเลข
        System.out.println(a + " + " + b + " = " + divide(a,b));
        
        
    }
}

