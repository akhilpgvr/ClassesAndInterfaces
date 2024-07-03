import rules.CalculatorRule;

import java.util.Scanner;

public class Calculator implements CalculatorRule {
    @Override
    public int integerSum(int x, int y) {
        return x+y;
    }

    @Override
    public float floatAddition(float x, float y) {
        return x+y;
    }

    @Override
    public int integerDivision(int x, int y) {
        return x/y;
    }

    @Override
    public float floatDivision(float x, float y) {
        return (float) x /y;
    }

    public void calculatorOperations() {

        Scanner sc = new Scanner(System.in);

        System.out.println("--------- Integer Operations ---------");
        System.out.print("Enter Number1: ");
        int x = sc.nextInt();
        System.out.print("Enter Number2: ");
        int y = sc.nextInt();
        System.out.println("Integer Addition = "+ integerSum(x,y));
        System.out.println("Integer Division = "+ integerDivision(x,y));
        System.out.println("--------- Float Operations ---------");
        System.out.print("Enter Number1: ");
        float i = sc.nextFloat();
        System.out.print("Enter Number2: ");
        float j = sc.nextFloat();
        System.out.println("Float Addition = "+ floatAddition(i, j));
        System.out.println("Float Division = "+ floatDivision(i, j));
    }
}
