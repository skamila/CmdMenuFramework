package skamila.cmdMenuFramework.menuEntry;

public interface MenuEntry extends Comparable<MenuEntry> {

    public int getId();
    public int getOrderNumber();
    public String getName();

}
