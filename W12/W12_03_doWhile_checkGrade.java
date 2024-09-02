package W12;

import java.util.Scanner;

public class W12_03_doWhile_checkGrade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

       int score;                            // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้ป้อน
       do {
        System.out.print("Enter your score (1-100) : ");
        score = kb.nextInt();
    } while (score<1 || score>100);   
    
    if (score > 100 || score < 0) {               // ตรวจสอบเกรด
            System.out.println("กรุณากรอกใหม่");
        } else if (score >= 80) {
            System.out.println("คุณได้เกรด A");
        } else if (score >= 70) {
            System.out.println("คุณได้เกรด B");
        } else if (score >= 60) {
            System.out.println("คุณได้เกรด C");
        } else if (score >= 50) {
            System.out.println("คุณได้เกรด D");
        } else {
            System.out.println("คุณได้เกรด E");
        }
    kb.close(); // ปิด Scanner object
}
}
// ให้ผู้ใช้ป้อนข้อมูลซ้ำจนกว่าจะถูกต้อง
// แสดงข้อความให้ผู้ใช้ป้อนข้อมูล between 1 and 100:
// รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร number
// ถ้าผู้ใช้ป้อนไม่ถูกต้องให้ป้อนใหม่
// แสดงข้อมูลที่ผู้ใช้ป้อน เช่น ou entered: 75
// ตรวจสอบเกรด