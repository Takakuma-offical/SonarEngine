package Engine.Core;

import java.util.ArrayList;
import java.util.List;

public class Engine_goAdmin {

    private static final List<GameObject> objects = new ArrayList<>();

    public static void add(GameObject obj) {
        objects.add(obj);
    }

    public static List<GameObject> getAll() {
        return objects;
    }
}
