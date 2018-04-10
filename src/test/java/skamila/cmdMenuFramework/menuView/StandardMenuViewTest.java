package skamila.cmdMenuFramework.menuView;

import skamila.cmdMenuFramework.Action;
import skamila.cmdMenuFramework.menuEntry.MenuEntry;
import skamila.cmdMenuFramework.menuEntry.MenuEntryAction;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class StandardMenuViewTest {
    void view() {
        ArrayList<MenuEntry> menu = new ArrayList<>();
        menu.add(new MenuEntryAction(1, 1, "nazwa1", mock(Action.class)));
        menu.add(new MenuEntryAction(2, 2, "nazwa2", mock(Action.class)));
        menu.add(new MenuEntryAction(3, 3, "nazwa3", mock(Action.class)));

        DataExtractor<ArrayList<MenuEntry>> dataExtractor = new StandardDataExtractor();
        StandardMenuView view = new StandardMenuView();
        String[] menuByLines = view.generate(dataExtractor.extract(menu)).split("\n");

    }
}