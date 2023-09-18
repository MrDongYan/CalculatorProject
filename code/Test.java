
import java.util.Scanner;

public class Test {
    // 这是一个计算器
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数A:");
        double numberA = sc.nextDouble();
        System.out.println("请选择运算符：(+,-,*,/)");
        String c = sc.next();
        System.out.println("输入第二个数B:");
        double numberB = sc.nextDouble();

        switch (c.charAt(0)){
            case '+':
                System.out.println(" numberA + numberB = " + (numberA + numberB));
                break;
            case '-':
                System.out.println(" numberA + numberB = " + (numberA + numberB));
                break;
            case '*':
                System.out.println(" numberA + numberB = " + (numberA + numberB));
                break;
            case '/':
                if(numberB == 0) {System.out.println("除数不能为0"); return;}
                System.out.println(" numberA + numberB = " + (numberA + numberB));
                break;
            default:
                System.out.println("您输入的运算符有误");
        }
    }
}
