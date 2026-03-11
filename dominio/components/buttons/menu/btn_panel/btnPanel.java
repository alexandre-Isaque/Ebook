package dominio.components.buttons.menu.btn_panel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class btnPanel extends JPanel
{

    public btnPanel(JButton btn)
    {
        setVisible(true);
        setPreferredSize(new Dimension(100, 100));
        setLayout(new FlowLayout(FlowLayout.LEFT));

        // add components
        add(btn);
    }
    
}
