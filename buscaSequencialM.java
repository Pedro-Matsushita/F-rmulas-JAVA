import java.util.*;
public class buscaSequencialM
{
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args){
        int vet[] = new int[5];
        int procurado = 9;
        int tamanho = vet.length;

        entradaValores(vet, tamanho);

        int buscarNumero = buscaSequencial(vet, procurado, tamanho);
    }
    public static void entradaValores(int vet[], int tamanho){
        for(int i = 0; i < tamanho; i++){
            System.out.print("Digite o "+ (i+1) +"° valor do vetor: ");
            vet[i] = teclado.nextInt();
        }
        System.out.println();
    }
    public static int buscaSequencial(int vet[], int procurado, int tamanho){
        boolean achou = false;
        int i;

        for(i = 0; i < tamanho; i++){
            if(vet[i] == procurado){
                achou = true;
                System.out.println("O número "+ procurado +" foi encontrado na posição "+ (i+1));
                break;
            }
            else if(vet[i] > procurado){
                System.out.println("O número não foi encontrado!");
                break;
            }
        }
            if(achou == true){
                return i;
            }
            else{
                return -1;
            }
    }
}