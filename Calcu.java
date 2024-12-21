public class Calcu {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        if (result == 3) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}