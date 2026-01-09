package Engine.windows;

import Engine.Core.ConfigLoader;
import Engine.Core.Window;
import Engine.Core.WindowConfig;

import javax.swing.SwingUtilities;

public class WindowsWindowMain {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            WindowConfig config =
                    ConfigLoader.loadWindowConfig("WindowConfig.config");

            Window window =
                    new WindowsWindowFunction(config);

            window.create();
            window.show();
        });
    }
}
