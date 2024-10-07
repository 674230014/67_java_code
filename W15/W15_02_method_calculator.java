package W15;

public class W15_02_method_calculator {
    // ทั้งหมดเป็น method ที่มีการรับค่าและคืนค่า
    // 1) Method สำหรับบวกเลข
       static int plus(int a, int b){
            System.out.print(a + " + " + b + " = ");
            return a+b;
       }
    // 2) Method สำหรับลบเลข
        static int minus(int a, int b){
            System.out.print(a + " - " + b + " = ");
            return a-b;
        }

    // 3) Method สำหรับคูณเลข
        static int multiply(int a, int b){
            System.out.print(a + " x " + b + " = ");
            return a*b;
        }

    // 4) Method สำหรับหารเลข
        static int divide(int a, int b){
            System.out.print(a + " % " + b + " = ");
            return a/b;
        }

        public static void main(String[] args) {
        // 1) Method สำหรับบวกเลข
        System.out.println(plus(10,10));

        // 2) Method สำหรับลบเลข
        System.out.println(minus(10,10));

        // 3) Method สำหรับคูณเลข
        System.out.println(multiply(10,10));

        // 4) Method สำหรับหารเลข
        System.out.println(divide(10,10));
    }


}
