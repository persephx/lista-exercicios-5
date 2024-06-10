import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(ePalindromo(receber()));

    }
    static String receber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma palavra para verificar se é ou não um palindromo: ");
        String palavra = in.nextLine();
        return palavra;
    }

    static boolean ePalindromo(String palavra) {
        palavra = palavra.replaceAll("\\s", "").toLowerCase();


        for (int i = 0, j = palavra.length() - 1; i < j; i++, j--) {

            if (palavra.charAt(j) != palavra.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
