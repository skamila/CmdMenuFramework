package skamila.cmdMenuFramework.menuPrinter;

import skamila.cmdMenuFramework.menuPrinter.MenuPrinterStandard;
import org.junit.jupiter.api.Test;
import skamila.cmdMenuFramework.Action;
import skamila.cmdMenuFramework.menuEntry.MenuEntry;
import skamila.cmdMenuFramework.menuEntry.MenuEntryAction;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;

class MenuPrinterStandardTest {

    @Test
    void printTest(){

        ArrayList<MenuEntry> menu = new ArrayList <> ();
        menu.add(new MenuEntryAction(1,1,"nazwa1", mock(Action.class)));
        menu.add(new MenuEntryAction (2,2,"nazwa2", mock(Action.class)));
        menu.add(new MenuEntryAction (3,3,"nazwa3", mock(Action.class)));

        MenuPrinterStandard menuPrinter = new MenuPrinterStandard ();
//        menuPrinter.print(menu);
    }

}