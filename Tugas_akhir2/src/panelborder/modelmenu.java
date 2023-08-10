/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package panelborder;

import panelborder.modelmenu.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author mantaps
 */
public class modelmenu {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public modelmenu(String name, MenuType type) {
        this.name = name;
        this.type = type;
    }

    public modelmenu() {
    }

    private String name;
    private MenuType type;

    public static enum MenuType {
        TITLE, MENU, EMPTY
    }
}
