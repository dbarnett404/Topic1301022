/**
 * This is the main class all programs will have a Main class
 */
public class Main {
    /**
     * Simple method to add two numbers
     * @param num1 the first number to add
     * @param num2 the second number to add
     */
    static int addTwoNumbers(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

    static int subtractTwoNumbers(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }

    /**
     * This is the main method - all programs have a main method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int answer = addTwoNumbers(2, 4);
        //Type sout and press enter
        System.out.println("Answer is " + answer);
        answer = subtractTwoNumbers(2, 4);
        System.out.println("Answer is " + answer);
    }
}