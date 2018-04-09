package skamila.cmdMenuFramework.menuView;

import skamila.cmdMenuFramework.menuEntry.MenuEntry;

import java.util.ArrayList;
import java.util.HashMap;

public class StandardDataExtractor implements DataExtractor<ArrayList<MenuEntry>> {
    @Override
    public ArrayList<HashMap<String, String>> extract(ArrayList<MenuEntry> menu) {
        ArrayList<HashMap<String, String>> menuData = new ArrayList<>();

        for (MenuEntry menuEntry : menu) {
            HashMap<String, String> entryData = new HashMap<>();
            entryData.put("name", menuEntry.getName());
            entryData.put("number", Integer.toString(menuEntry.getOrderNumber()));

            menuData.add(entryData);
        }

        return menuData;
    }
}
