package Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado");
    }

    /**
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException quando b for 0
     */
    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, B != 0");
        }
        return a / b;
    }
}
