import java.util.*;
public class CrescDecresc {
    public static void main(String[] args){
        int vet[] = new int[15];
        int tamanho = vet.length;

        entradaValores(vet, tamanho);

        System.out.println("Vetor não ordenado:");
        exibeVetor(vet, tamanho);
        System.out.println();

        int[] CresceOuDecresce = CresceDecresce(vet, tamanho);

        System.out.println("Vetor ordenado:");
        exibeVetor(vet, tamanho);
        System.out.println();
    }
    public static void entradaValores(int vet[], int tamanho){
        Random r = new Random();
        for(int i = 0; i<tamanho; i++){
            System.out.println("Número de posição "+(i+1)+" foi preenchido!");
            vet[i] = r.nextInt(20);
        }
        System.out.println();
    }
    public static int[] CresceDecresce(int vet[], int tamanho){
        while(tamanho >= 2){
            for(int i = 0; i < tamanho-1; i++){
                if(vet[i] < vet[i+1]){
                    int temp = vet[i];
                    vet[i] = vet[i+1];
                    vet[i+1] = temp;
                }
            }
            tamanho = tamanho-1;
        }
        return vet;
    }
    public static void exibeVetor(int vet[], int tamanho){
        for(int i=0; i<tamanho; i++){
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }
}
