public class exercise_3 {

    //Neste eu não vi necessidade de dividir funções pois era bem direto ao ponto.
    //Caso fosse necessário poderiamos fazer isto com recursividade para melhorar o desempenho.
    public static void main(String[] args){
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;
        while(K < INDICE){
            K++;
            SOMA += K;
        }
        System.out.println(SOMA);
    }
}