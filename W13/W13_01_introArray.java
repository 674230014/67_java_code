package W13;
public class W13_01_introArray{
    public static void main(String[] args) {
        //การประกาศตัวแปรชนิด Array แบบที่ 1 - รู้จำนวนข้อมูลล่วงหน้า
        String [] colors = {"Purple","Cyan","Blue","Green","Yellow","Orage","Red"};
        int [] banks = {20,50,100,500,1000};
        char [] Alphabet = {'A','B','C','D','E'};

        //แสดงผลลัพธ์โดยใช้ index ของ Array
        System.out.println("The first colors is " + colors[0]);
        System.out.println("The third alphabet " + Alphabet[2]);

        //แสดงผลโดยใช้ Loop
        System.out.println("Colors in the array are : ");
        for(int i=0 ; i<7 ; i++){
            System.out.print(colors[i] + " ");
        }
        System.out.println("\n==========================================");
        System.out.println("Colors in the array are : ");
        for(int i=6 ; i>=0 ; i--){
            System.out.print(colors[i] + " ");
        }
        System.out.println("\n==========================================");
        
        System.out.println("Banks in the array are : ");
        for(int i=0 ; i<banks.length ; i++){
            System.out.print(banks[i] + " ");
        }
        System.out.println("\n==========================================");
    }
}