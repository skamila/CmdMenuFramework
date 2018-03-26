package skamila;

public class MenuEntryAction implements MenuEntry {

    private int id, orderNumber;
    private String name;
    private Action action;

    public MenuEntryAction(int _id, int _orderNumber, String _name, Action _action){
        id = _id;
        orderNumber = _orderNumber;
        name = _name;
        action = _action;
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
}
