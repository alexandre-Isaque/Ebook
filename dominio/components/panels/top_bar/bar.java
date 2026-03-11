package dominio.components.panels.top_bar;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;

public class bar extends JPanel {
    private static final Color BG = new Color(34, 0, 155);
    private static final int WIDTH = 550;
    private static final int HEIGHT = 60;

    public bar()
    {
        setBackground(BG);
        setVisible(true);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setLayout(new FlowLayout());
    }

    public void addComponents(JPanel[] painels)
    {
        // add buttons
        for(JPanel painel: painels){
            add(painel);
            System.out.println("Adicionou");
        }
    }

}
