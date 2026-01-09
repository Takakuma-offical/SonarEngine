package Engine.Core;

import java.util.ArrayList;
import java.util.List;

public class Engine_goAdmin {

    private static final List<GameObject> gameObjects = new ArrayList<>();

    public static void register(GameObject obj) {
        gameObjects.add(obj);
        obj.onCreate();
    }

    public static List<GameObject> getAll() {
        return gameObjects;
    }

    // ★ 追加
    public static void updateAll(double deltaTime) {
        for (GameObject obj : gameObjects) {
            for (Component c : obj.getComponents()) {
                c.onUpdate(deltaTime);
            }
        }
    }
}
