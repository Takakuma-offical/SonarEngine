package project.Component;

import Engine.Core.Component;
import java.awt.Color;
import java.awt.Graphics2D;

public class SampleRenderComponent extends Component {

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillRect((int)transform.x, (int)transform.y, 50, 50);
    }
}
