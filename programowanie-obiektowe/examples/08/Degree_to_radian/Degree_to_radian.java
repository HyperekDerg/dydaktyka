import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Degree_to_radian extends JFrame {
    
    private JTextField value_field = new JTextField();
    private JLabel degree_label = new JLabel("°");
    private JButton convert_button = new JButton("=");
    private JLabel result_label = new JLabel();

    private final void set_icon() {
        ImageIcon img = new ImageIcon("../../../../fig/Kitty32x32.jpg");
        setIconImage(img.getImage());
    }
    
    private final void add_components() {
        add(value_field);
        add(degree_label);
        add(convert_button);
        add(result_label);
    }
    
    private final void set_bounds() {
        final int mx = 75; // "margines" w poziomie
        final int my = 10; // "margines" w pionie
        final int xx = 75; // szerokość komponentu
        final int yy = 30; // wysokość komponentu
        final int dx =  5; // szerokość odstępu poziomego
        final int dy =  5; // wysokość odstępu pionowego
        final int h  = 75; // wysokość ramki
        setBounds(0, 0, 4 * xx + 3 * dx + 2 * mx, h);
        value_field   .setBounds(                mx, my, xx, yy);
        degree_label  .setBounds(      mx + xx + dx, my, xx, yy);
        convert_button.setBounds(mx + 2 * (xx + dx), my, xx, yy);
        result_label  .setBounds(mx + 3 * (xx + dx), my, xx, yy);
    }
    
    private final void add_actions() {
        // Uwaga: Po `new` wykorzystano składnię tzw. klasy anonimowej.
        convert_button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    convert_to_radians(evt);
                }
            });
    }
    
    public Degree_to_radian() {
        super("Konwersja stopni na radiany");
        setLayout(null); // pozycjonowanie bezwzględne
        set_icon();
        add_components();
        set_bounds();
        add_actions();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    private void convert_to_radians(ActionEvent evt) {
        double val_deg = (double)(Double.parseDouble(value_field.getText()));
        double val_rad = val_deg * Math.PI / 180.;
        result_label.setText(String.format("%.2f", val_rad) + " rad");
    }
    
    public static void main(String args[]) {
        new Degree_to_radian().setVisible(true);
    }
}
