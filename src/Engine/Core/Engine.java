package Engine.Core;

public final class Engine {

    private static Window window;
    private static EngineConfig config;

    private Engine() {}

    public static void start() {
        System.out.println("Engine started");
    }

    public static void start(Window w, EngineConfig cfg) {
        window = w;
        config = cfg;

        window.create();
        window.show();
    }

    public static EngineConfig getConfig() {
        return config;
    }

    public static void shutdown() {
        if (window != null) {
            window.close();
        }
    }
}
