import java.text.DecimalFormat;

public class FP_formatting {
    public static void main(String[] args) {
        final double val = 137.035999084; // odwrócona stała struktury subtelnej
        
        // (1a)
        DecimalFormat df1a = new DecimalFormat("#.#");
        String str1a = df1a.format(val);
        System.out.println("Wartość: " + str1a);

        // (1b)
        DecimalFormat df1b = new DecimalFormat("#.##");
        String str1b = df1b.format(val);
        System.out.println("Wartość: " + str1b);
        
        // (2)
        String str2 = String.format("%.1f", val);
        System.out.println("Wartość: " + str2);
    }
}
