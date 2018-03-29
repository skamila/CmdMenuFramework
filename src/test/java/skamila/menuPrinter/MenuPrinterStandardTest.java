package skamila.menuPrinter;

import org.junit.jupiter.api.Test;
import skamila.Action;
import skamila.menuEntry.MenuEntry;
import skamila.menuEntry.MenuEntryAction;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MenuPrinterStandardTest {

    @Test
    public void printTest(){

        ArrayList<MenuEntry> menu = new ArrayList <> ();
        menu.add(new MenuEntryAction(1,1,"nazwa1", new Action()));
        menu.add(new MenuEntryAction (2,2,"nazwa2", new Action ()));
        menu.add(new MenuEntryAction (3,3,"nazwa3", new Action ()));

        MenuPrinterStandard menuPrinter = new MenuPrinterStandard ();
        menuPrinter.print(menu);
    }

}