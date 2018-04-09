package skamila.cmdMenuFramework.menuView;

import java.util.ArrayList;
import java.util.HashMap;

public interface DataExtractor<In> {
    ArrayList<HashMap<String, String>> extract(In menu);
}
