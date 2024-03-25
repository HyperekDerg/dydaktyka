import java.util.Scanner;

class DiagonalMatrix {
    private int size;
    private int[] diagonal;

    public DiagonalMatrix(int size) {
        this.size = size;
        this.diagonal = new int[size];
    }

    public void setElement(int index, int value) {
        if (index >= 0 && index < size) {
            diagonal[index] = value;
        } else {
            System.out.println("Błędny indeks.");
        }
    }

    public int trace() {
        int trace = 0;
        for (int i = 0; i < size; i++) {
            trace += diagonal[i];
        }
        return trace;
    }

    public int[] getDiagonal() {
        return diagonal;
    }

    public static DiagonalMatrix product(DiagonalMatrix matrix1, DiagonalMatrix matrix2) {
        if (matrix1.size != matrix2.size) {
            System.out.println("Matryce Diagonalne muszą posiadać te same wymiary.");
            return null;
        }

        DiagonalMatrix result = new DiagonalMatrix(matrix1.size);
        for (int i = 0; i < matrix1.size; i++) {
            result.setElement(i, matrix1.diagonal[i] * matrix2.diagonal[i]);
        }
        return result;
    }
}

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy diagonalnej: ");
        int size = scanner.nextInt();

        DiagonalMatrix matrix1 = new DiagonalMatrix(size);
        DiagonalMatrix matrix2 = new DiagonalMatrix(size);

        System.out.println("Podaj elementy dla matrycy 1:");
        for (int i = 0; i < size; i++) {
            System.out.print("Podaj element na pozycji (" + i + ", " + i + "): ");
            int element = scanner.nextInt();
            matrix1.setElement(i, element);
        }

        System.out.println("Podaj elementy dla matrycy 2:");
        for (int i = 0; i < size; i++) {
            System.out.print("Podaj element na pozycji (" + i + ", " + i + "): ");
            int element = scanner.nextInt();
            matrix2.setElement(i, element);
        }

        System.out.println("Wyznaczony ślad dla matrycy 1: " + matrix1.trace());
        System.out.println("Wyznaczony ślad dla matrycy 2: " + matrix2.trace());

        DiagonalMatrix product = DiagonalMatrix.product(matrix1, matrix2);
        if (product != null) {
            System.out.println("Wynik iloczynu matrycy 1 i matrycy 2:");
            int[] productDiagonal = product.getDiagonal();
            for (int i = 0; i < size; i++) {
                System.out.println("Element [" + i + ", " + i + "]: " + productDiagonal[i]);
            }
        }

        scanner.close();
    }
}
