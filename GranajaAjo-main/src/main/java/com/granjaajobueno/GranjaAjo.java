
package com.granjaajobueno;

import com.granjaajobueno.gui.MainMenu;

public class GranjaAjo {

    public static void main(String[] args) {
        
        //Creando variable y metodos para que se abra la aplicacion directamente del archivo main y no desde las interfaces
        
        MainMenu newmenu = new MainMenu();
        newmenu.setVisible(true);
        newmenu.setLocationRelativeTo(null);
        
    }

    
}
