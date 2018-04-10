package skamila.cmdMenuFramework.menuEntry;

import java.util.ArrayList;

public class MenuEntrySubmenu implements MenuEntry {

    private int id, orderNumber;
    private String name;
    private ArrayList<MenuEntry> menuEntries;

    public MenuEntrySubmenu(int id, int orderNumber, String name, ArrayList<MenuEntry> menuEntries){
        this.id = id;
        this.orderNumber = orderNumber;
        this.name = name;
        this.menuEntries = menuEntries;
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
