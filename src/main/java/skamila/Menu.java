package skamila;
import skamila.menuEntry.MenuEntry;
import skamila.menuPrinter.MenuPrinter;

import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuEntry> menuEntries, activeMenu;

    public Menu(ArrayList<MenuEntry> _menuEntries){
        menuEntries = _menuEntries;
    }

    public void printMenu(MenuPrinter printer){
        printer.print(activeMenu);
    }
}
