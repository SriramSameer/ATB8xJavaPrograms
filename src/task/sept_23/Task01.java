package task.sept_23;

public class Task01 {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 2;
        char ch = '+';
        switch (ch) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Operation not mentioned");
        }
    }
}
