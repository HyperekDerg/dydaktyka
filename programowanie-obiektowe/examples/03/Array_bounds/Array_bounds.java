public class Array_bounds {
    public static void main(String[] args) {
        int arr[] = new int[42];
        
        try {
            System.out.println(arr[42]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Szczegóły wyjątku: " + e.getMessage());
        }
        
        try {
            System.out.println(arr[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Szczegóły wyjątku: " + e.getMessage());
        }
    }
}
