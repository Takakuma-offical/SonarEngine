package Engine.Core;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class EngineCanvas extends JPanel {

    private static EngineCanvas instance;

    public EngineCanvas() {
        instance = this;
        System.out.println("EngineCanvas created");instance = this;

    }

    public static void repaintCanvas() {
        if (instance != null) {
            instance.repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        EngineGraphics.renderAll((Graphics2D) g);
    }
}
