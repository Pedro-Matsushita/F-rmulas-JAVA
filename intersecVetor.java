import java.util.*;
public class intersecVetor
{
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args){
        int vetA[] = new int[5];
        int vetB[] = new int[5];
        int tamanho = vetA.length;

        entradaValores(vetA, tamanho);
        entradaValores(vetB, tamanho)
    }
    public static void entradaValores(int vetA[], int tamanho){
        for(int i = 0; i<tamanho; i++){
            System.out.print("Digite o "+ (i+1)+ "° valor do vetor: ");
            vetA[i] = teclado.nextInt();
        }
        System.out.println();
    }
    for(int )
}