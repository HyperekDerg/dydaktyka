import java.util.Scanner;
import java.util.Random;

public class Array {
    public static int get_length(java.io.InputStream is) {
        Scanner s = new Scanner(is);
        int n = s.nextInt();
        s.close();
        return n;
    }
    
    public static void random(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; ++i) {
            array[i] = r.nextInt(10);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Program wypełnia losowo n-elementową tablicę.");
        System.out.print("Podaj wartość n: ");
        int n = get_length(System.in);
        
        int arr[] = new int[n];
        random(arr);
        
        System.out.print("Wylosowane wartości: ");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
