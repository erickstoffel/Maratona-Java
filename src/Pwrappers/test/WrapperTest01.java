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


    }
}
