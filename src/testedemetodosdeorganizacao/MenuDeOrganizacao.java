package testedemetodosdeorganizacao;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MenuDeOrganizacao {

    public void menuInicial() {

        //Crio um vetor que armazena os tamanhos dos vetores que vamos ultilizar
        int[] tamanhoVetores = {100, 500, 1000, 5000, 20000, 50000, 100000, 500000};

        //Menu básico
        System.out.println("Seja bem vindo(a). Aperte enter para iniciar a medição!");
        Scanner teclado = new Scanner(System.in);
        teclado.nextLine();

        //Informo o inicio dos testes
        System.out.println("Iniciando os testes.");
        //crio três métodos para que a organização dos testes fique mais facil.
        menuCoutingSort(tamanhoVetores);
        menuRadixSort(tamanhoVetores);
        menuBucketSort(tamanhoVetores);

    }

    //crio um menu para testar os três casos do Radix Sort, recebo o tamanho dos vetores.
    public void menuRadixSort(int[] tamanhoVetores) {

        //aqui eu chamo cada caso e passo o tamanho dos vetores
        System.out.println("Radix Sort");
        organizarRadixCrescente(tamanhoVetores);
        organizarRadixDecrescente(tamanhoVetores);
        organizarRadixAleatorio(tamanhoVetores);

    }

    //esse método faz o teste do Radix sort crescente
    public void organizarRadixCrescente(int[] tamanhoVetores) {
        System.out.println("Testando Radix Sort com vetor organizado crescente");

        for (int i = 0; i < tamanhoVetores.length; i++) {

            int[] vetorOrganizar = preencheVetorCrescente(tamanhoVetores[i]); //esse método retorna um vetor inteiro, e fica reponsalvél por preencher ele
            int maiorElemento = acharMaiorElemento(vetorOrganizar); //esse método retorna um inteiro, a onde ele procura o maior elemento
            int digitos = String.valueOf(maiorElemento).length(); //aqui eu pego os digitos
            long tempoInicial = iniciaMedicaoTempo(); //inicia a medição de tempo
            RadixSort.radixSort(vetorOrganizar, digitos); //chama o método de organização
            finalizaMedicaoTempo(tempoInicial); //finaliza a medição

            /*
            Essa é a logica basica do código, como cada algoritimo tem seu jeito de funcionar, alguns parâmetros podem mudar
             */
        }

    }

    //organiza de maneira crescente um vetor que está organizado de maneira decrescente
    public void organizarRadixDecrescente(int[] tamanhoVetores) {

        System.out.println("Testando Radix Sort com vetor organizado decrescente");

        for (int i = 0; i < tamanhoVetores.length; i++) {
            int[] vetorOrganizar = preencheVetorDecrescente(tamanhoVetores[i]); //
            int maiorElemento = acharMaiorElemento(vetorOrganizar);
            int digitos = String.valueOf(maiorElemento).length();
            long tempoInicial = iniciaMedicaoTempo();
            RadixSort.radixSort(vetorOrganizar, digitos);
            finalizaMedicaoTempo(tempoInicial);
        }
    }

    //aqui é preenchido de forma aleatoria usando seeds
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

    //esse é o menu do couting sort, contendo as três chamadas de organização
    public void menuCoutingSort(int[] tamanhoVetores) {

        //aqui funciona da mesma maneira, chamando para testar todos os casos
        System.out.println("Couting Sort");
        organizarCoutingCrescente(tamanhoVetores);
        organizarCoutingDecrescente(tamanhoVetores);
        organizarCoutingAleatorio(tamanhoVetores);

    }

    public void organizarCoutingCrescente(int[] tamanhoVetores) {

        System.out.println("Testando Couting Sort com vetor organizado crescente");

        for (int i = 0; i < tamanhoVetores.length; i++) {

            int[] vetorDesorganizado = preencheVetorCrescente(tamanhoVetores[i]); //crio o vetor desorganizado
            int[] vetorOrganizado = new int[tamanhoVetores[i]]; //crio o vetor auxiliar que vai ficar organizado, nesse momento ele está vazio
            int maiorElemento = acharMaiorElemento(vetorDesorganizado); //acho o maior elemento
            long tempoInicial = iniciaMedicaoTempo(); //inicio a medição de tempo
            CoutingSort.countingSort(vetorDesorganizado, vetorOrganizado, vetorDesorganizado.length, maiorElemento); //chamo o método de organização
            finalizaMedicaoTempo(tempoInicial); //termino a contagem e printo no terminal

        }

    }

    public void organizarCoutingDecrescente(int[] tamanhoVetores) {

        //Aqui temos o mesmo funcionamento
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

        //aqui temos o mesmo funcionamento, a estrutura basica é a mesma
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

    //aqui iniciamos os testes com o Bucket sort
    public void menuBucketSort(int[] tamanhoVetores) {

        System.out.println("Bucket Sort Sort");
        organizarBucketCrescente(tamanhoVetores);
        organizarBucketDecrescente(tamanhoVetores);
        organizarBucketAleatorio(tamanhoVetores);
    }

    public void organizarBucketCrescente(int[] tamanhoVetores) {

        System.out.println("Testando Bucket Sort com vetor organizado crescente");

        for (int i = 0; i < tamanhoVetores.length; i++) {
            int[] vetorDesorganizadoInteiro = preencheVetorCrescente(tamanhoVetores[i]); //crio o vetor a ser organizado
            double[] vetorDesorganizadoDouble = trocarTipos(vetorDesorganizadoInteiro); //crio um vetor vazio do tipo double e troco os valores do anterior que está int para double
            long tempoInicial = iniciaMedicaoTempo();//inicia medição de tempo
            double[] vetorOrganizado = BucketSort.bucketSort(vetorDesorganizadoDouble); //crio uma classe que retorna um vetor do tipo double
            finalizaMedicaoTempo(tempoInicial);//finalizo a medição de tempo

        }
    }

    public void organizarBucketDecrescente(int[] tamanhoVetores) {

        System.out.println("Testando Bucket Sort com vetor organizado decrescente");

        for (int i = 0; i < tamanhoVetores.length; i++) {

            //aqui a logica é a mesma
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

            //aqui a logica e a mesma
            int[] vetorDesorganizadoInteiro = preencheVetorAleatorio(tamanhoVetores[i]);
            double[] vetorDesorganizadoDouble = trocarTipos(vetorDesorganizadoInteiro);
            long tempoInicial = iniciaMedicaoTempo();
            double[] vetorOrganizado = BucketSort.bucketSort(vetorDesorganizadoDouble);
            finalizaMedicaoTempo(tempoInicial);

        }
    }

    //esse método retorna um vetor do tipo int e recebe o tamanho do vetor a ser preenchido como parametro
    public int[] preencheVetorCrescente(int tamanhoVetor) {

        //crio o vetor a ser preenchido
        int[] vetor = new int[tamanhoVetor];

        //esse for percorre por todas as posições e preenche o vetor
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] += i;
        }

        //aqui ele retorna o vetor
        return vetor;

    }

    //aqui preenchemos da mesma maneira, a diferença está apenas dentro do laço
    public int[] preencheVetorDecrescente(int tamanhoVetor) {

        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {

            //aqui, eu pego o tamanho e subtraio pelo i
            vetor[i] += tamanhoVetor - i;

        }

        //aqui retorno normalmente
        return vetor;

    }

    //aqui já é um pouco diferente
    public int[] preencheVetorAleatorio(int tamanhoVetor) {

        //crio um vetor vazio para preencher
        int[] vetor = new int[tamanhoVetor];

        //aqui eu crio minha seed, ela vai me permitir que os vetores sejam criados de maneira igual, fazendo que o teste fique justo
        long seed = 100L;
        Random sorteio = new Random(seed);

        for (int i = 0; i < tamanhoVetor; i++) {

            //aqui eu preencho o vetor usando um sorteio que criei com uma Random usando a minha seed
            vetor[i] += sorteio.nextInt(100);
        }

        //aqui retorno o vetor
        return vetor;
    }

    //aqui eu inicio a medição de tempo, e retorno ela como um valor do tipo long
    private long iniciaMedicaoTempo() {

        //uso esse método do nanoTime, para maior precisão
        long iniciarMedicao = System.nanoTime();
        return iniciarMedicao;

    }

    //aqui eu finalizo a medição de tempo, passando o tempo inicial como parâmetro
    public void finalizaMedicaoTempo(long tempoInicial) {

        //pego o tempo no final da execução
        long finalizarMedicao = System.nanoTime();

        //a duração total é o tempo final menos o tempo inicial
        long duracaoTotal = finalizarMedicao - tempoInicial;

        //printo a duração aqui
        System.out.println("Tempo de execução é igual a: "
                + duracaoTotal / 1_000_000 + " ms");
    }

    //esse método fica responsavel por achar o maior elemento do vetor a ser organizado
    private int acharMaiorElemento(int[] vetorDesorganizado) {

        //defino o maior elemento como 0, para que ele inicialize a variavel
        int maiorElemento = 0;
        //esse for passa por todas as posições do meu vetor
        for (int i = 0; i < vetorDesorganizado.length; i++) {
            //esse if verifica se a posição atual do meu vetor possui um elemento maior que o meu maiorElemento
            if (vetorDesorganizado[i] > maiorElemento) {
                //caso ache, ele seta um novo maiorElemento
                maiorElemento = vetorDesorganizado[i];
            }
        }

        //aqui eu retorno o maior elemento
        return maiorElemento;

    }

    //esse método troca o tipo Int para o tipo double
    public double[] trocarTipos(int[] inteiros) {
        //aqui crio um vetor do mesmo tamanho dos inteiros para fazer a troca
        double[] decimais = new double[inteiros.length];

        int max = acharMaiorElemento(inteiros); //aqui eu acho o maior elemento

        //esse for faz a troca para os decimais
        for (int i = 0; i < inteiros.length; i++) {
            decimais[i] = (double) inteiros[i] / max;
        }

        //aqui eu retorno o valor array de doubles
        return decimais;

    }
}
