public class SwapNumbers {
        public static void main(String[] args) {
            int num1 = 5, num2 = 10;
            System.out.println("Original values: num1 = " + num1 + ", num2 = " + num2);
            num1 = num1 + num2; // num1 = 15
            num2 = num1 - num2; // num2 = 5
            num1 = num1 - num2; // num1 = 10
            System.out.println("Swapped values: num1 = " + num1 + ", num2 = " + num2);
        }
    }

