package skamila.cmdMenuFramework;

import org.junit.jupiter.api.Test;
import skamila.cmdMenuFramework.menuEntry.MenuEntry;
import skamila.cmdMenuFramework.menuEntry.MenuEntryAction;
import skamila.cmdMenuFramework.menuEntry.MenuEntrySubmenu;
import skamila.cmdMenuFramework.menuPrinter.MenuPrinterStandard;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    public void test(){

        ArrayList<MenuEntry> menuLvl2 = new ArrayList <> ();
        menuLvl2.add(new MenuEntryAction(1,1,"nazwa2.1", new Action()));
        menuLvl2.add(new MenuEntryAction (2,2,"nazwa2.2", new Action ()));
        menuLvl2.add(new MenuEntryAction (3,3,"nazwa3.3", new Action ()));

        ArrayList <MenuEntry> menuLvl1 = new ArrayList <> ();
        menuLvl1.add(new MenuEntrySubmenu(4,1,"nazwa1.1", menuLvl2));
        menuLvl1.add(new MenuEntryAction (5,2,"nazwa1.2", new Action ()));
        menuLvl1.add(new MenuEntryAction (6,3,"nazwa1.3", new Action ()));

        Menu menu = new Menu (menuLvl1, new MenuPrinterStandard());
        menu.doMenu();
    }

}