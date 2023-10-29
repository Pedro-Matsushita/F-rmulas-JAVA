import java.util.*;
public class buscaDouble {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[]args){
        double vet[] = new double[10];
        int tamanho = vet.length;
        double procurado = 10;

        entradaValores(vet, tamanho);

        int buscaNDouble = buscaBinaria(vet, tamanho, procurado);
    }
    public static void entradaValores(double vet[], int tamanho){
        for(int i = 0; i<tamanho; i++){
            System.out.print("Digite o "+(i+1)+"° valor do vetor: ");
            vet[i]=teclado.nextDouble();
        }
        System.out.println();
    }
    public static int buscaBinaria(double vet[], int tamanho, double procurado){
        int inicio = 0;
        int meio;
        int fim = tamanho-1;
        boolean achou = false;
        while(inicio <= fim){
            meio = (inicio + fim)/2;
            if(vet[meio] == procurado){
                achou = true; 
                System.out.println("O número "+ procurado +" foi encontrado na posição "+ meio);
                return meio;
            }
            else if(vet[meio] > procurado){
                fim = meio-1;
            }
            else{
                inicio = meio+1;
            }
        }          
            return -1;
    }
}