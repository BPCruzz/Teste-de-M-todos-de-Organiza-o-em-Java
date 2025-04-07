package testedemetodosdeorganizacao;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MenuDeOrganizacao {

    public void menuInicial() {

        int[] tamanhoVetores = {100, 500, 1000, 5000, 20000, 50000, 100000, 500000};

        System.out.println("Seja bem vindo(a). Aperte enter para iniciar a medição!");
        Scanner teclado = new Scanner(System.in);
        teclado.nextLine();
        System.out.println("Iniciando os testes.");
        menuCoutingSort(tamanhoVetores);
        menuRadixSort(tamanhoVetores);
        menuBucketSort(tamanhoVetores);

    }

    public void menuRadixSort(int[] tamanhoVetores) {

        System.out.println("Radix Sort");
        organizarRadixCrescente(tamanhoVetores);
        organizarRadixDecrescente(tamanhoVetores);
        organizarRadixAleatorio(tamanhoVetores);

    }

    public void organizarRadixCrescente(int[] tamanhoVetores) {
        System.out.println("Testando Radix Sort com vetor organizado crescente");

        for (int i = 0; i < tamanhoVetores.length; i++) {
            int[] vetorOrganizar = preencheVetorCrescente(tamanhoVetores[i]);
            int maiorElemento = acharMaiorElemento(vetorOrganizar);
            int digitos = String.valueOf(maiorElemento).length();
            long tempoInicial = iniciaMedicaoTempo();
            RadixSort.radixSort(vetorOrganizar, digitos);
            finalizaMedicaoTempo(tempoInicial);
        }

    }

    public void organizarRadixDecrescente(int[] tamanhoVetores) {
        System.out.println("Testando Radix Sort com vetor organizado decrescente");

        for (int i = 0; i < tamanhoVetores.length; i++) {
            int[] vetorOrganizar = preencheVetorDecrescente(tamanhoVetores[i]);
            int maiorElemento = acharMaiorElemento(vetorOrganizar);
            int digitos = String.valueOf(maiorElemento).length();
            long tempoInicial = iniciaMedicaoTempo();
            RadixSort.radixSort(vetorOrganizar, digitos);
            finalizaMedicaoTempo(tempoInicial);
        }
    }

    public void organizarRadixAleatorio(int[] tamanhoVetores) {
        System.out.println("Testando Radix Sort com vetor aleatorio");

        for (int i = 0; i < tamanhoVetores.length; i++) {
            int[] vetorOrganizar = preencheVetorAleatorio(tamanhoVetores[i]);
            int maiorElemento = acharMaiorElemento(vetorOrganizar);
            int digitos = String.valueOf(maiorElemento).length();
            long tempoInicial = iniciaMedicaoTempo();
            RadixSort.radixSort(vetorOrganizar, digitos);
            finalizaMedicaoTempo(tempoInicial);
        }
    }

    public void menuCoutingSort(int[] tamanhoVetores) {
        System.out.println("Couting Sort");
        organizarCoutingCrescente(tamanhoVetores);
        organizarCoutingDecrescente(tamanhoVetores);
        organizarCoutingAleatorio(tamanhoVetores);

    }

    public void organizarCoutingCrescente(int[] tamanhoVetores) {
        System.out.println("Testando Couting Sort com vetor organizado crescente");

        for (int i = 0; i < tamanhoVetores.length; i++) {
            int[] vetorDesorganizado = preencheVetorCrescente(tamanhoVetores[i]);
            int[] vetorOrganizado = new int[tamanhoVetores[i]];
            int maiorElemento = acharMaiorElemento(vetorDesorganizado);
            long tempoInicial = iniciaMedicaoTempo();
            CoutingSort.countingSort(vetorDesorganizado, vetorOrganizado, vetorDesorganizado.length, maiorElemento);
            finalizaMedicaoTempo(tempoInicial);
        }

    }

    public void organizarCoutingDecrescente(int[] tamanhoVetores) {
        System.out.println("Testando Couting Sort com vetor organizado decrescente");

        for (int i = 0; i < tamanhoVetores.length; i++) {
            int[] vetorDesorganizado = preencheVetorDecrescente(tamanhoVetores[i]);
            int[] vetorOrganizado = new int[tamanhoVetores[i]];
            int maiorElemento = acharMaiorElemento(vetorDesorganizado);
            long tempoInicial = iniciaMedicaoTempo();
            CoutingSort.countingSort(vetorDesorganizado, vetorOrganizado, vetorDesorganizado.length, maiorElemento);
            finalizaMedicaoTempo(tempoInicial);
        }

    }

    public void organizarCoutingAleatorio(int[] tamanhoVetores) {
        System.out.println("Testando Couting Sort com vetor aleatorio");

        for (int i = 0; i < tamanhoVetores.length; i++) {
            int[] vetorDesorganizado = preencheVetorAleatorio(tamanhoVetores[i]);
            int[] vetorOrganizado = new int[tamanhoVetores[i]];
            int maiorElemento = acharMaiorElemento(vetorDesorganizado);
            long tempoInicial = iniciaMedicaoTempo();
            CoutingSort.countingSort(vetorDesorganizado, vetorOrganizado, vetorDesorganizado.length, maiorElemento);
            finalizaMedicaoTempo(tempoInicial);
        }
    }

    public void menuBucketSort(int[] tamanhoVetores) {
        System.out.println("Bucket Sort Sort");
        organizarBucketCrescente(tamanhoVetores);
        organizarBucketDecrescente(tamanhoVetores);
        organizarBucketAleatorio(tamanhoVetores);
    }

    public void organizarBucketCrescente(int[] tamanhoVetores) {
        System.out.println("Testando Bucket Sort com vetor organizado crescente");

        for (int i = 0; i < tamanhoVetores.length; i++) {
            int[] vetorDesorganizadoInteiro = preencheVetorCrescente(tamanhoVetores[i]);
            double[] vetorDesorganizadoDouble = trocarTipos(vetorDesorganizadoInteiro);
            long tempoInicial = iniciaMedicaoTempo();
            double[] vetorOrganizado = BucketSort.bucketSort(vetorDesorganizadoDouble);
            finalizaMedicaoTempo(tempoInicial);

        }
    }

    public void organizarBucketDecrescente(int[] tamanhoVetores) {
        System.out.println("Testando Bucket Sort com vetor organizado decrescente");

        for (int i = 0; i < tamanhoVetores.length; i++) {
            int[] vetorDesorganizadoInteiro = preencheVetorDecrescente(tamanhoVetores[i]);
            double[] vetorDesorganizadoDouble = trocarTipos(vetorDesorganizadoInteiro);
            long tempoInicial = iniciaMedicaoTempo();
            double[] vetorOrganizado = BucketSort.bucketSort(vetorDesorganizadoDouble);
            finalizaMedicaoTempo(tempoInicial);

        }

    }

    public void organizarBucketAleatorio(int[] tamanhoVetores) {
        System.out.println("Testando Bucket Sort com vetor aleatorio");

        for (int i = 0; i < tamanhoVetores.length; i++) {
            int[] vetorDesorganizadoInteiro = preencheVetorAleatorio(tamanhoVetores[i]);
            double[] vetorDesorganizadoDouble = trocarTipos(vetorDesorganizadoInteiro);
            long tempoInicial = iniciaMedicaoTempo();
            double[] vetorOrganizado = BucketSort.bucketSort(vetorDesorganizadoDouble);
            finalizaMedicaoTempo(tempoInicial);

        }
    }

    public int[] preencheVetorCrescente(int tamanhoVetor) {
        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] += i;
        }

        return vetor;

    }

    public int[] preencheVetorDecrescente(int tamanhoVetor) {
        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] += tamanhoVetor - i;
        }

        return vetor;

    }

    public int[] preencheVetorAleatorio(int tamanhoVetor) {
        int[] vetor = new int[tamanhoVetor];
        long seed = 100L;
        Random sorteio = new Random(seed);

        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] += sorteio.nextInt(100);
        }

        return vetor;
    }

    private long iniciaMedicaoTempo() {

        long iniciarMedicao = System.nanoTime();
        return iniciarMedicao;

    }

    public void finalizaMedicaoTempo(long tempoInicial) {

        long finalizarMedicao = System.nanoTime();
        long duracaoTotal = finalizarMedicao - tempoInicial;
        System.out.println("Tempo de execução é igual a: "
                + duracaoTotal / 1_000_000 + " ms");
    }

    private int acharMaiorElemento(int[] vetorDesorganizado) {
        int maiorElemento = 0;
        for (int i = 0; i < vetorDesorganizado.length; i++) {
            if (vetorDesorganizado[i] > maiorElemento) {
                maiorElemento = vetorDesorganizado[i];
            }
        }

        return maiorElemento;

    }

    public double[] trocarTipos(int[] inteiros) {
        double[] decimais = new double[inteiros.length];

        int max = acharMaiorElemento(inteiros); // função que você já tem

        for (int i = 0; i < inteiros.length; i++) {
            decimais[i] = (double) inteiros[i] / max;
        }

        return decimais;

    }
}
