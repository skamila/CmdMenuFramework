package skamila.cmdMenuFramework.menuEntry;

import skamila.cmdMenuFramework.Action;

public class MenuEntryAction implements MenuEntry {

    private int id, orderNumber;
    private String name;
    private Action action;

    public MenuEntryAction(int id, int orderNumber, String name, Action action){
        this.id = id;
        this.orderNumber = orderNumber;
        this.name = name;
        this.action = action;
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

    public Action getAction() {
        return action;
    }

    public int compareTo(MenuEntry menuEntry) {
            return orderNumber - menuEntry.getOrderNumber();
    }
}


