package skamila.cmdMenuFramework.menuView;

import java.util.ArrayList;
import java.util.HashMap;

public class StandardMenuView implements MenuView {

    @Override
    public String generate(ArrayList<HashMap<String, String>> menuData) {
        StringBuilder stringBuilder = new StringBuilder();

        for(HashMap<String, String> entryData : menuData) {
            stringBuilder.append(entryData.get("number"));
            stringBuilder.append(". ");
            stringBuilder.append(entryData.get("name"));
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
