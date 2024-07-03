import rules.StringRule2;

import java.util.Scanner;

public class StringOperations implements StringRule2 {

    //Since we extend StringRule2 with StringRule1, We have to Override methods in StringRule1
    @Override
    public String concatenate(String str1, String str2) {
        return str1+ " "+ str2;
    }

    @Override
    public String[] splitString(String str, String splitEle) {
        return str.split(splitEle);
    }

    public void stringOperations() {

        Scanner sc = new Scanner(System.in);
        System.out.println("--------- String Concatenations ---------");
        System.out.print("Enter String1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter String2: ");
        String str2 = sc.nextLine();
        System.out.println(concatenate(str1, str2));
        System.out.println("--------- String Split ---------");
        System.out.print("Enter String1: ");
        String str3 = sc.nextLine();
        System.out.print("Enter Split element: ");
        String splitEle = sc.nextLine();
        System.out.println(concatenate(str3, splitEle));
    }
}
