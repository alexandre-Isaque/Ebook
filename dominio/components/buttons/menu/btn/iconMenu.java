package dominio.components.buttons.menu.btn;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class iconMenu extends JButton {
    // height and width
    private static final int HEIGHT = 200;
    private static final int WIDTH = 200;
    // path icon
    private String path_icon = "./icon/menu-aberto.png";
    Icon icon = new ImageIcon(path_icon);

    public iconMenu ()
    {
        setIcon(icon);
        setSize(new Dimension(WIDTH, HEIGHT));
        setVisible(true);
        setText("Menu");
        setBackground(new Color(55, 86, 33));
        setForeground(new Color(255, 255, 255));
    }
}
