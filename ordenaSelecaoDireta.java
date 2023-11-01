import java.util.*;
public class ordenaSelecaoDireta
{
    public static void main(String[] args){
        int vet[] = new int[10];
        int tamanho = vet.length;
        
        entradaValores(vet, tamanho);

        System.out.println("Vetor padrão:");
        exibeVetor(vet, tamanho);
        System.out.println();

        int ordenaVetor[] = selecaoDireta(vet, tamanho);

        System.out.println("Vetor ordenado:");
        exibeVetor(ordenaVetor, tamanho);
    }
    public static void entradaValores(int vet[], int tamanho){
        Random aleatorio = new Random();
        for(int i = 0; i<tamanho; i++){
            System.out.println((i+1)+ "° valor do vetor foi preenchido!");
            vet[i] = aleatorio.nextInt(20);
        }
        System.out.println();
    }
    public static int[] selecaoDireta(int[] vet, int tamanho){
        int i, j, menor, temp;
        for (i = 0; i < tamanho - 1; i++){
            menor = i;
            for (j = i + 1; j <= tamanho - 1; j++){
                    if (vet[j] < vet[menor]){ 
                        menor = j;  
                    }
                }
                temp = vet[i];
                vet[i] = vet[menor];
                vet[menor] = temp;
            }
            return(vet);
        }
        public static void exibeVetor(int vet[], int tamanho){
            for(int i = 0; i<tamanho; i++){
                System.out.print(vet[i] +" ");
            }
            System.out.println();
        }
}