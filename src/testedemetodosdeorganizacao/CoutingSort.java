package testedemetodosdeorganizacao;

import java.util.Arrays;

public class CoutingSort {

    public static void countingSort(int[] entrada, int[] saida, int tamanho, int valorMaximo) {
        int[] contagem = new int[valorMaximo + 1];

        // Etapa 1: Inicializa o vetor de contagem com zeros
        for (int i = 0; i <= valorMaximo; i++) {
            contagem[i] = 0;
        }

        // Etapa 2: Conta a frequência de cada valor no vetor de entrada
        for (int j = 0; j < tamanho; j++) {
            contagem[entrada[j]] = contagem[entrada[j]] + 1;
        }

        // Etapa 3: Soma cumulativa das contagens
        for (int i = 1; i <= valorMaximo; i++) {
            contagem[i] = contagem[i] + contagem[i - 1];
        }

        // Etapa 4: Monta o vetor de saída ordenado
        for (int j = tamanho - 1; j >= 0; j--) {
            saida[contagem[entrada[j]] - 1] = entrada[j];
            contagem[entrada[j]] = contagem[entrada[j]] - 1;
        }

        System.out.println("vetor apos ordenação: " + "\n" + Arrays.toString(saida));
    }

}
