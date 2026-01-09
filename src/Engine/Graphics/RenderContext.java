package Engine.Graphics;

import java.awt.Graphics2D;

public class RenderContext {

    private final Graphics2D g;

    public RenderContext(Graphics2D g) {
        this.g = g;
    }

    public Graphics2D getGraphics() {
        return g;
    }
}
