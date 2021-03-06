package skamila.cmdMenuFramework.menuView;

import org.junit.jupiter.api.Test;
import skamila.cmdMenuFramework.Action;
import skamila.cmdMenuFramework.menuEntry.MenuEntry;
import skamila.cmdMenuFramework.menuEntry.MenuEntryAction;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class StandardDataExtractorTest {

    @Test
    void extract() {
        ArrayList<MenuEntry> menu = new ArrayList<>();
        menu.add(new MenuEntryAction(1, 1, "nazwa1", mock(Action.class)));
        menu.add(new MenuEntryAction(2, 2, "nazwa2", mock(Action.class)));
        menu.add(new MenuEntryAction(3, 3, "nazwa3", mock(Action.class)));

        DataExtractor<ArrayList<MenuEntry>> dataExtractor = new StandardDataExtractor();
        ArrayList<HashMap<String, String>> extractedData = dataExtractor.extract(menu);

        assertEquals("nazwa1", extractedData.get(0).get("name"));
        assertEquals("1", extractedData.get(0).get("number"));
        assertEquals("nazwa2", extractedData.get(1).get("name"));
        assertEquals("2", extractedData.get(1).get("number"));
        assertEquals("nazwa3", extractedData.get(2).get("name"));
        assertEquals("3", extractedData.get(2).get("number"));
    }
}