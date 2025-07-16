package Pwrappers.test;

import java.util.List;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1L;
        float floatP = 1F;
        double doubleP = 1D;
        char charP = 'a';
        boolean booleanP = false;

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; //Boxing
        Long longW = 1L;
        Float floatW = 1F;
        Double doubleW = 1D;
        Character charW = 'a';
        Boolean booleanW = false;

        int i = intW; //Unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isLowerCase('!'));
        System.out.println(Character.isUpperCase('!'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
