package Engine.Core;

import java.util.ArrayList;
import java.util.List;

public interface GameObject {

    // 実装クラス側で保持
    List<Component> getComponents();

    default void onCreate() {
    }

    default <T extends Component> T addComponent(T component) {
        component.setGameObject(this);
        getComponents().add(component);
        component.onCreate();
        return component;
    }

    default <T extends Component> T getComponent(Class<T> type) {
        for (Component c : getComponents()) {
            if (type.isInstance(c)) {
                return type.cast(c);
            }
        }
        return null;
    }
}
