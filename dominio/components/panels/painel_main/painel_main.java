package dominio.components.panels.painel_main;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class painel_main extends JPanel {
    // color of backgroud
    private static final Color BG = new Color(28, 28, 28);

    // config basic
    public painel_main(){
        setVisible(true);
        setBackground(BG);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    // add components
    public void addComponents(JPanel painel){
        add(painel);
    }
}
