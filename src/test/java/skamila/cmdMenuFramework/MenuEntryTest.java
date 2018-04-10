package skamila.cmdMenuFramework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import skamila.cmdMenuFramework.menuEntry.MenuEntry;
import skamila.cmdMenuFramework.menuEntry.MenuEntryAction;
import skamila.cmdMenuFramework.menuEntry.MenuEntrySubmenu;

import java.util.ArrayList;

class MenuEntryTest {
    @Test
    void testMenuStructure () {
        ArrayList<MenuEntry> menuLvl2 = new ArrayList <> ();
        menuLvl2.add(new MenuEntryAction(1,1,"nazwa2.1", mock(Action.class)));
        menuLvl2.add(new MenuEntryAction (2,2,"nazwa2.2", mock(Action.class)));
        menuLvl2.add(new MenuEntryAction (3,3,"nazwa3.3", mock(Action.class)));

        ArrayList <MenuEntry> menuLvl1 = new ArrayList <> ();
        menuLvl1.add(new MenuEntrySubmenu(4,1,"nazwa1.1", menuLvl2));
        menuLvl1.add(new MenuEntryAction (5,2,"nazwa1.2", mock(Action.class)));
        menuLvl1.add(new MenuEntryAction (6,3,"nazwa1.3", mock(Action.class)));

        assertEquals(3, menuLvl1.size());
        assertEquals(3, menuLvl2.size());
    }
}