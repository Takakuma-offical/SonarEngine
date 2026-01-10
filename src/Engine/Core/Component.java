package Engine.Core;

public abstract class Component {
    protected GameObject gameObject;
    protected Transform transform;

    void attach(GameObject obj) {
        this.gameObject = obj;
        this.transform = obj.transform;
    }

    public void update() {}
    public void render(java.awt.Graphics2D g) {}
}
