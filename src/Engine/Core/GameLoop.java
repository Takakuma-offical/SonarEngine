package Engine.Core;

import javax.swing.Timer;

public class GameLoop {

    private static final int FPS = 60;

    public static void start() {
        int delay = 1000 / FPS;

        new Timer(delay, e -> {
            update();
            EngineCanvas.repaintCanvas();
        }).start();
    }

    private static void update() {
        for (GameObject obj : Engine_goAdmin.getAll()) {
            obj.update();
        }
    }
}
