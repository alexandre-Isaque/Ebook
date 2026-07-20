package dominio.components.buttons.menuRight;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class menu extends JButton{
    public menu(){
        setVisible(true);
        setPreferredSize(new Dimension(100, 10));
        setBackground(new Color(55, 86, 33));
        setForeground(new Color(255, 255, 255));
        setText("Opções");
    }
}
