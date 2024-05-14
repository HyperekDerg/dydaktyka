import javax.swing.*;

public class Menu_example extends JFrame {
    private JMenuBar menubar = new JMenuBar();
    private JMenu menu = new JMenu("Menu");
    private JMenuItem item1 = new JMenuItem("Element 1");
    private JMenuItem item2 = new JMenuItem("Element 2");

    private final void set_icon() {
        ImageIcon img = new ImageIcon("../../../../fig/Kitty32x32.jpg");
        setIconImage(img.getImage());
    }
    
    private final void add_components() {
        setJMenuBar(menubar);
        menubar.add(menu);
        menu.add(item1);
        menu.add(item2);
    }
    
    public Menu_example() {
        super("Program z menu");
        set_icon();
        add_components();
        setBounds(0, 0, 250, 125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new Menu_example().setVisible(true);
    }
}
