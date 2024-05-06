import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CustomButton extends JButton {
    public CustomButton(String label, String tooltip) {
        super(label);
        this.setToolTipText(tooltip);
    }
}

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Kliknij t en przycisk!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        CustomButton customButton = new CustomButton("Kliknij mnie!!!!", "Zrób to! A spotkasz coś nowego!");

        customButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(MainFrame.this, "Gratulacje! Oto coś nowego czyli okienko :D");
            }
        });

        add(customButton);

        setSize(500, 300);
        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new MainFrame());
    }
}
