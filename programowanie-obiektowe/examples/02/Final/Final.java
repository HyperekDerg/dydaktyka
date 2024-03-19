public class Final {
    public final static int answer = 42;
    
    public static void main(String[] args) {
        final int my_answer = 42;
        if (my_answer == answer) {
            System.out.println("Odpowiedź prawidłowa!");
        }
        // answer++;    // Błąd!
        // my_answer++; // Błąd!
    }
}
