package Engine.Graphics;

import Engine.Core.Component;
import Engine.Core.GameObject;
import Engine.Core.RenderComponent;

import java.awt.Graphics2D;
import java.util.List;

public class EngineGraphics {

    public static void renderAll(
            List<GameObject> gameObjects,
            Graphics2D g
    ) {
        RenderContext ctx = new RenderContext(g);

        for (GameObject obj : gameObjects) {
            for (Component c : obj.getComponents()) {
                if (c instanceof RenderComponent rc) {
                    rc.onRender(ctx);
                }
            }
        }
    }
}
