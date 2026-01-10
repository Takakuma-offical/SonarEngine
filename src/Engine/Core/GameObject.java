package Engine.Core;

import java.util.ArrayList;
import java.util.List;

public class GameObject {

    public final Transform transform = new Transform();
    private final List<Component> components = new ArrayList<>();

    public void addComponent(Component c) {
        c.attach(this);
        components.add(c);
    }

    public void update() {
        for (Component c : components) c.update();
    }

    public void render(java.awt.Graphics2D g) {
        for (Component c : components) c.render(g);
    }
}
