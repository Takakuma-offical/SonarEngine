package Engine.windows;

import Engine.Core.Engine_goAdmin;
import Engine.Graphics.EngineGraphics;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class EngineCanvas extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        EngineGraphics.renderAll(
                Engine_goAdmin.getAll(),
                (Graphics2D) g
        );
    }
}
