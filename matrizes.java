public class Matrizes {

    public static void main(String[] args){
        int linha1 = 2, coluna1 = 3, linha2 = 3, coluna2 = 2;
        int matriz1[][] = {{3, 1, 3}, {6, 5, 5}};
        int matriz2[][] = {{100, 50},{50, 100}, {50, 50}};

        multiplicaMatriz(linha1, linha2, coluna1, coluna2, matriz1, matriz2);
    }
    static void multiplicaMatriz(int linha1, int linha2, int coluna1, int coluna2, int matriz1[][], int matriz2[][]) {
        System.out.println("Matriz 1: ");
        printMatriz(matriz1, linha1, coluna1);
        System.out.println();
        System.out.println("Matriz 2: ");
        printMatriz(matriz2, linha2, coluna2);

        int matriz3[][] = new int[linha1][coluna2];
        for (int i = 0; i < linha1; i++) {
            for (int j = 0; j < coluna2; j++) {
                for (int k = 0; k < linha2; k++) {
                    matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        System.out.println();
        System.out.println("Resultado:");
        printMatriz(matriz3, linha1, coluna2);
    }
    static void printMatriz(int matriz[][], int linha, int coluna) {
        for (int i = 0; i < linha; i++) {
            System.out.print("[");
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}