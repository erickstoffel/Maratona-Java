package Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {

        String nome = "Erick"; //String constant pool
        String nome2 = "Erick";
        nome = nome.concat(" Stoffel");

        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Erick"); // 1 variavel de refêrencia, 2 objetos do tipo strin, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
