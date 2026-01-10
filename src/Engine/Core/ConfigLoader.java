package Engine.Core;

public class ConfigLoader {

    public static WindowConfig loadWindowConfig(String path) {
        return new WindowConfig("My Game", 800, 600);
    }
}
