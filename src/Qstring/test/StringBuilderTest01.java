package Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Maria";
        nome.concat(" Linda");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Maria");
        sb.append(" Linda").append(" Teste");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb.toString());
    }
}
