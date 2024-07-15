public class W03_01_NetPrice {
    public static void main(String[] args) {
        short price = 350;
        byte quantity = 10;
        byte persendiscount = 5;
        int totalPrice = price * quantity;
        int discount = totalPrice * persendiscount / 100;
        int netPrice = totalPrice - discount;
        System.out.println("ราคาสินค้ารวม = " + totalPrice + " บาท");
        System.out.println("ส่วนลด = " + discount + " บาท");
        System.out.println("ราคาสุทธิ = " + netPrice + " บาท");
    }
}