public class DebugDemo {

    public static void main(String[] args) {
        int price = 10;
        int quantity = 3;

        int total = calculateTotal(price, quantity);

        System.out.println("Expected total: $30");
        System.out.println("Actual total: $" + total);
    }

    static int calculateTotal(int price, int quantity) {
        int result = price + quantity;
        return result;
    }
}