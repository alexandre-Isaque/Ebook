package dominio.components.text.titleName;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JLabel;

public class title extends JLabel{

    private Point p = new Point(550 / 2, 0);

    public title(){
        setText("Eboo");
        setFont(new Font("Ariel", 0, 20));
        setForeground(new Color(0, 0, 0));
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setLocation(p);
    }
}
