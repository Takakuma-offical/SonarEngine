package Engine.Core;

public class ConfigLoader {

    public static WindowConfig loadWindowConfig(String path) {
        // いまは仮で固定値
        return new WindowConfig("My Game", 800, 600);
    }
}
