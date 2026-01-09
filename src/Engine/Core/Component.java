package Engine.Core;

public abstract class Component {

    private GameObject gameObject;

    void setGameObject(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    public GameObject getGameObject() {
        return gameObject;
    }

    public void onCreate() {
    }

    // ★ 追加
    public void onUpdate(double deltaTime) {
    }
}
