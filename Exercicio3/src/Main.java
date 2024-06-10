import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Resultado = " + potenciacao(receberNumeroX(),receberNumeroY()));
    }

    //FUNÇÕES AQUI:
    static int receberNumeroX() {
        Scanner in = new Scanner(System.in);
        int numeroX;
        System.out.println("Digite um numero inteiro para substituir x:");
        numeroX = in.nextInt();
        return numeroX;
    }
    static int receberNumeroY() {
        Scanner in = new Scanner(System.in);
        int numeroY;
        do {
            System.out.println("Digite um numero inteiro maior ou igual a 0 para substituir y:");
            numeroY = in.nextInt();
        } while (numeroY < 0);
        return numeroY;
    }

    static long potenciacao(int numeroX, int numeroY){ //--> 'Long' para resultados enormes
        long resultado = 1; //--> Inicializa o resultado como 1
        for (int i = 0; i < numeroY; i++) { //--> Potência
            resultado *= numeroX; //--> Multiplica o resultado pela base 'X'
        }
        return resultado;
    }
}
