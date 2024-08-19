import java.util.Random;
import java.util.HashSet;

public static void main(String[] args){
    ArvoreAvl arvore = new ArvoreAvl();
    Random numAleatorio = new Random();
    HashSet<Integer> numerosInseridos = new HashSet<>();

    while(numerosInseridos.size() < 100){
        int numero = numAleatorio.nextInt(1001) - 500;
        if(numerosInseridos.add(numero)){
            arvore.raiz = arvore.inserir(arvore.raiz, numero);
        }
    }

    System.out.println("arvore avl após adições");
    arvore.preOrdem(arvore.raiz);
    System.out.println("é uma árvore avl: true = sim e false = não. resposta: "+arvore.eArvoreAvl(arvore.raiz)); //sem tempo para usar resultado boolean e gerar a resposta automático
    

    int numerosRemovidos = 0;
    while(numerosRemovidos< 20){
        int numero = numAleatorio.nextInt(1001)- 500;
        if(numerosInseridos.remove(numero)){
            arvore.raiz = arvore.remover(arvore.raiz, numero);
            numerosRemovidos++;
        }
    }
    System.out.println("\nárvore após remoções");
    arvore.preOrdem(arvore.raiz);
    System.out.println("é uma árvore avl: "+arvore.eArvoreAvl(arvore.raiz));
}