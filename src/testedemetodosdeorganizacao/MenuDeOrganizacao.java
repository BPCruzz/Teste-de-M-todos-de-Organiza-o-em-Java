package testedemetodosdeorganizacao;

import java.util.Arrays;
import java.util.Scanner;

public class MenuDeOrganizacao {
    
    public void menuInicial() {
        
        int[] tamanhoVetores = {100, 500, 1000, 5000, 20000, 50000, 100000, 500000};
        
        System.out.println("Seja bem vindo(a). Aperte enter para iniciar a medição!");
        Scanner teclado = new Scanner(System.in);
        teclado.nextLine();
        menuRadixSort(tamanhoVetores);
        
    }
    
    public void menuRadixSort(int[] tamanhoVetores) {
        System.out.println("Iniciando os testes.");
        organizarRadixCrescente(tamanhoVetores);
        
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
    
    public void organizarRadixDecrescente() {
        
    }
    
    public void organizarRadixAleatorio() {
        
    }
    
    public void menuCoutingSort() {
        
    }
    
    public void organizarCoutingCrescente() {
        
    }
    
    public void organizarCoutingDecrescente() {
        
    }
    
    public void organizarCoutingAleatorio() {
        
    }
    
    public void menuBucketSort() {
        
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
    
    public void preencheVetorDecrescente() {
        
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
