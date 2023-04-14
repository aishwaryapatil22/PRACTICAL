package perform;

public class Calculator {
    public int add(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public int subtract(int... nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result -= nums[i];
        }
        return result;
    }

    public int multiply(int... nums) {
        int result = 1;
        for (int num : nums) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition result: " + calculator.add(1, 2, 9, 4, 5));
        System.out.println("Subtraction result: " + calculator.subtract(10, 5, 3));
        System.out.println("Multiplication result: " + calculator.multiply(7, 3, 4));
    }
}