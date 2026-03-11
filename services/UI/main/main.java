package services.UI.main;

import javax.swing.JPanel;

import dominio.components.buttons.menu.btn.iconMenu;
import dominio.components.buttons.menu.btn_panel.btnPanel;
import dominio.components.panels.painel_main.painel_main;
import dominio.components.panels.top_bar.bar;
import dominio.components.windows.window;

public class main {
    // Components
    // window
    private window janela = new window();
    //painel main
    private painel_main painelMain = new painel_main();
    // top bar
    private bar topBar = new bar();
    // icon Menu
    private iconMenu menu = new iconMenu();
    private btnPanel BtnPanel = new btnPanel(menu);

    public main(){
        main_app();
    }

    // window init
    private void main_app(){
        // windows add painel
        janela.addComponents(painelMain);
        // painel add top_bar
        painelMain.addComponents(topBar);

        // add the method
        topBarComponents();
    }

    private void topBarComponents(){
        // all painels of top bar
        JPanel[] panels = {BtnPanel};

        topBar.addComponents(panels);
    }
}
