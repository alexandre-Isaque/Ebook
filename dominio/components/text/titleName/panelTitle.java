package dominio.components.text.titleName;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class panelTitle extends JPanel{
    public panelTitle(JLabel title) {
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(100, 100));

        add(title);
    }
}
