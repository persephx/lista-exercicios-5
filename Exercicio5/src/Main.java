import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int [] array = {1, 3, 5, 7, 9, 11, 13};
        Scanner scanner = new Scanner(System.in);
        int busca = 0;
        System.out.println("Insira o número a ser buscado no Array");
        busca = scanner.nextInt();
        if(buscaBinaria(array, busca) <0){
            System.out.println("Esse número não existe nesse Array.");
        }else {
            System.out.println("Esse número se encontra na posição " + buscaBinaria(array, busca) + " do Array.");
        }

    }

    static int buscaBinaria(int[] array, int elemento) {
        int arrayEsquerdo = 0;
        int arrayDireito = array.length - 1;

        while (arrayEsquerdo <= arrayDireito) {
            int meio = arrayEsquerdo + (arrayDireito - arrayEsquerdo) / 2;

            if (array[meio] == elemento) {
                return meio;
            } else if (array[meio] < elemento) {
                arrayEsquerdo = meio + 1;
            } else {
                arrayDireito = meio - 1;
            }
        }

        return -1;
    }

}

