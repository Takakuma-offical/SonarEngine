package Engine.Core;

import Engine.windows.EngineCanvas;

public class GameLoop implements Runnable {

    private static final int TARGET_FPS = 60;
    private static final double FRAME_TIME = 1.0 / TARGET_FPS;

    private boolean running = true;
    private final EngineCanvas canvas;

    public GameLoop(EngineCanvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();

        while (running) {
            long now = System.nanoTime();
            double deltaTime = (now - lastTime) / 1_000_000_000.0;
            lastTime = now;

            // Update
            Engine_goAdmin.updateAll(deltaTime);

            // Render
            canvas.repaint();

            // FPS制御
            try {
                Thread.sleep(
                        Math.max(0,
                                (long) ((FRAME_TIME - deltaTime) * 1000))
                );
            } catch (InterruptedException ignored) {
            }
        }
    }

    public void stop() {
        running = false;
    }
}
