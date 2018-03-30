package skamila.cmdMenuFramework.menuPrinter;
import skamila.cmdMenuFramework.menuEntry.MenuEntry;

import java.util.ArrayList;

public class MenuPrinterStandard implements MenuPrinter {

    public void print(ArrayList<MenuEntry> menuEntries){

        for (MenuEntry m : menuEntries){
            System.out.println(m.getOrderNumber() + ". " + m.getName());
        }

    }

}
