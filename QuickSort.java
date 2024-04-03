public class QuickSort {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 3, 7, 1, 8, 6, 4}; 
        
        quickSort(vetor, 0, vetor.length - 1);
        
        System.out.println("Vetor ordenado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }   
    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particiona(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1); 
            quickSort(vetor, posicaoPivo + 1, fim); 
        }
    }
    
    public static int particiona(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1;
        int j = fim;
        
        while (i <= j) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (vetor[j] > pivo) {
                j--;
            } else {
                troca(vetor, i, j);
            }
        }     
        troca(vetor, inicio, j); 
        return j;
    }    
    public static void troca(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}