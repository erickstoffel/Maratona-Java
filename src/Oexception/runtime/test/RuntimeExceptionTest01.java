package Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //Checked e Unchecked
        Object object = null;
        System.out.println(object.toString()); //NullPointerException

        int[] num = {1,2};
        System.out.println(num[2]); //ArrayOutOfBoundsException
    }
}
