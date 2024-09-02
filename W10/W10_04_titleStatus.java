package W10;

import java.util.Scanner;

public class W10_04_titleStatus {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ระบุเพศ (male/female): ");
        String gander = kb.next();
        System.out.print("ระบุอายุ: ");
        int age = kb.nextInt();
        System.out.print("สถานะสมรส (single/married): ");
        String isMarried = kb.next();

        if (gander.equalsIgnoreCase("male")) {
            if (age < 15) {
                System.out.println("ด.ช.");
            } else {
                System.out.println("นาย");
            }
        } else {
            if (age < 15) {
                System.out.println("ด.ญ.");
            } else if (isMarried.equalsIgnoreCase("married")) {
                System.out.println("นางสาว");
            } else {
                System.out.println("นาง");
            }
        }
        kb.close();
    }
}
