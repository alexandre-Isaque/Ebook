package dominio.components.panels.top_bar;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class bar extends JPanel {
    private static final Color BG = new Color(55, 86, 33);
    private static final int WIDTH = 550;
    private static final int HEIGHT = 70;

    public bar()
    {
        setBackground(BG);
        setVisible(true);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setLayout(new GridLayout(1,0));
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
