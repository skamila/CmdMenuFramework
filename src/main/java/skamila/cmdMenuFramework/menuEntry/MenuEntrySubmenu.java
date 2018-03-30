package skamila.cmdMenuFramework.menuEntry;

import java.util.ArrayList;

public class MenuEntrySubmenu implements MenuEntry {

    private int id, orderNumber;
    private String name;
    private ArrayList<MenuEntry> menuEntries;

    public MenuEntrySubmenu(int _id, int _orderNumber, String _name, ArrayList<MenuEntry> _menuEntries){
        id = _id;
        orderNumber = _orderNumber;
        name = _name;
        menuEntries = _menuEntries;
    }

    public int getId() {
        return id;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }

    public ArrayList<MenuEntry> getMenuEntries() {
        return menuEntries;
    }

    public int compareTo(MenuEntry menuEntry) {
        return orderNumber - menuEntry.getOrderNumber();
    }
}
