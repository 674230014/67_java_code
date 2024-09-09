package W13;

public class W13_03_Array_CoundOddEven {
    public static void main(String[] args) {
        int[]numbers = {21,42,63,84,10,12,47,16,18,29,2,4,6,8,7};

        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i] + " ");
            if (numbers[i] % 2 == 0 ) {
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("\nAmount of all number : " + numbers.length);
        System.out.println("Amount of odd number : " + countOdd);
        System.out.println("Amount of even number : " + countEven);

    }
}
