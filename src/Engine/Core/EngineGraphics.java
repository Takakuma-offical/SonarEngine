package Engine.Core;

import java.awt.Graphics2D;

public class EngineGraphics {

    public static void renderAll(Graphics2D g) {
        for (GameObject obj : Engine_goAdmin.getAll()) {
            obj.render(g);
        }
    }
}
