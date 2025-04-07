package testedemetodosdeorganizacao;

import java.util.Arrays;

public class RadixSort {

    public static void radixSort(int[] vetor, int numeroDeDigitos) {
        int fator = 1; // Começa pelas unidades

        for (int i = 0; i < numeroDeDigitos; i++) {
            countingSortPorDigito(vetor, fator);
            fator *= 10; // Vai para dezenas, centenas, etc.
        }
        
        System.out.println("Vetor Organizado: " + "\n" + Arrays.toString(vetor));

    }

    // Counting Sort adaptado para ordenar com base em um dígito específico
    private static void countingSortPorDigito(int[] vetor, int fator) {
        int tamanho = vetor.length;
        int[] saida = new int[tamanho];
        int[] contagem = new int[10]; // Dígitos de 0 a 9

        // Conta a frequência dos dígitos na posição atual
        for (int i = 0; i < tamanho; i++) {
            int digito = (vetor[i] / fator) % 10;
            contagem[digito]++;
        }

        // Soma cumulativa das contagens
        for (int i = 1; i < 10; i++) {
            contagem[i] += contagem[i - 1];
        }

        // Monta o vetor de saída ordenado pelo dígito atual
        for (int i = tamanho - 1; i >= 0; i--) {
            int digito = (vetor[i] / fator) % 10;
            saida[contagem[digito] - 1] = vetor[i];
            contagem[digito]--;
        }

        // Copia o resultado de volta para o vetor original
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = saida[i];
        }

    }

}
