package testedemetodosdeorganizacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static double[] bucketSort(double[] entrada) {

        int tamanho = entrada.length;
        List<Double>[] baldes = new ArrayList[tamanho];

        // Etapa 1: Inicializa os baldes
        for (int i = 0; i < tamanho; i++) {
            baldes[i] = new ArrayList<>();
        }

        // Etapa 2: Distribui os elementos nos baldes
        for (int i = 0; i < tamanho; i++) {
            int indiceBalde = (int) (tamanho * entrada[i]); // Supondo que entrada[i] está entre 0 e 1
            indiceBalde = Math.min(indiceBalde, tamanho - 1);
            baldes[indiceBalde].add(entrada[i]);
        }

        // Etapa 3: Ordena cada balde individualmente
        for (int i = 0; i < tamanho; i++) {
            Collections.sort(baldes[i]);
        }

        // Etapa 4: Junta os baldes em um único vetor de saída
        double[] resultado = new double[tamanho];
        int pos = 0;
        for (int i = 0; i < tamanho; i++) {
            for (double valor : baldes[i]) {
                resultado[pos++] = valor;
            }
        }

        return resultado;
    }

}
