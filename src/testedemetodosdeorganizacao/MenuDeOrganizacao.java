package testedemetodosdeorganizacao;

import java.util.Arrays;
import java.util.Scanner;

public class MenuDeOrganizacao {

    public void menuInicial() {

        int[] tamanhoVetores = {100};

        System.out.println("Seja bem vindo(a). Aperte enter para iniciar a medição!");
        Scanner teclado = new Scanner(System.in);
        teclado.nextLine();
        System.out.println("Iniciando os testes.");

        menuRadixSort(tamanhoVetores);
        menuBucketSort(tamanhoVetores);
        menuCoutingSort(tamanhoVetores);

    }

    public void menuRadixSort(int[] tamanhoVetores) {
        System.out.println("Radix Sort");
        organizarRadixCrescente(tamanhoVetores);
        organizarRadixDecrescente(tamanhoVetores);

    }

    public void organizarRadixCrescente(int[] tamanhoVetores) {
        System.out.println("Testando Radix Sort com vetor organizado crescente");

        for (int i = 0; i < tamanhoVetores.length; i++) {
            int[] vetorOrganizar = preencheVetorCrescente(tamanhoVetores[i]);
            long tempoInicial = iniciaMedicaoTempo();
            //chamo o método de organizar
            finalizaMedicaoTempo(tempoInicial);
        }

    }

    public void organizarRadixDecrescente(int[] tamanhoVetores) {
        System.out.println("Testando Radix Sort com vetor organizado decrescente");

        for (int i = 0; i < tamanhoVetores.length; i++) {
            int[] vetorOrganizar = preencheVetorDecrescente(tamanhoVetores[i]);
            long tempoInicial = iniciaMedicaoTempo();
            //chamo o método de organizar
            finalizaMedicaoTempo(tempoInicial);
        }
    }

    public void organizarRadixAleatorio() {

    }

    public void menuCoutingSort(int[] tamanhoVetores) {

    }

    public void organizarCoutingCrescente() {

    }

    public void organizarCoutingDecrescente() {

    }

    public void organizarCoutingAleatorio() {

    }

    public void menuBucketSort(int[] tamanhoVetores) {

    }

    public void organizarBucketCrescente() {

    }

    public void organizarBucketDecrescente() {

    }

    public void organizarBucketAleatorio() {

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
        
        System.out.println(Arrays.toString(vetor));

        return vetor;

    }

    public void preencheVetorAleatorio() {

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

}
