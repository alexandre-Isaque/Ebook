package dominio.components.windows;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class window extends JFrame {
    // Height and Width
    private static final int HEIGHT = 800;
    private static final int WIDTH = 550;

    // config basic
    public window(){
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // add Components
    public void addComponents(JPanel painel){
        add(painel);
    }
}
