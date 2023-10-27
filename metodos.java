import java.util.*;
public class metodos
{
static Scanner teclado = new Scanner(System.in);
public static void main(String[] args){
    int vet[] = new int[5];
    int procurado = 10;
    int tamanho = vet.length;

    entradaValores(vet);

    int encontraMaiorouMenor[] = metodoBolha(vet);

   //int buscarNumero = buscaSequencial(vet, procurado, n);

   exibeVetor(vet);
}
public static void entradaValores(int vet[]){
    Random r = new Random();
    for(int i = 0; i<vet.length; i++){
        System.out.print("Digite o valor do vetor: ");
        vet[i] = r.nextInt(15);
    }
    System.out.println();
}
//Método bolha encontrar o maior ou menor número e colocar em ordem
//crescente ou decrescente
public static int[] metodoBolha(int vet[]){
    int tamanho = vet.length;
    while(tamanho >= 2){
        for(int i = 0; i < tamanho-1; i++){
            if(vet[i] > vet[i+1]){ //Ordem crescente
                int temp = vet[i];
                vet[i] = vet[i+1];
                vet[i+1] = temp;
            }
        }
        tamanho = tamanho - 1;
    }
    return vet;
}
/*public static int buscaSequencial(double vet[], double procurado, int tamanho){
    boolean achou = false;
    int i;

    for(i = 0; i< tamanho; i++){
        if(vet[i] == procurado){
            achou = true;
            System.out.println("Número "+ procurado + " encontrado na posição "+ (i+1));
            break;
        }
        else if(vet[i] > procurado){
            System.out.println("Elemento não encontrado.");
            break;
        }
    }
    if(achou == true){
    
        return i; // retorna a posição onde encontrou a chave
    }
    else{
        return -1; // retorna -1 indicando que não achou a chave
    }
}*/
public static void exibeVetor(int vet[]){
    for(int i = 0; i < vet.length; i++){
        System.out.println(vet[i]);
    }
    System.out.println();
}
}