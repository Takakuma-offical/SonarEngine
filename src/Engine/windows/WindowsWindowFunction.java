package Engine.windows;

import Engine.Core.Window;
import Engine.Core.WindowConfig;

import javax.swing.JFrame;

public class WindowsWindowFunction implements Window {

    private JFrame frame;
    private EngineCanvas canvas;   // ← ★これが必要
    private final WindowConfig config;

    public WindowsWindowFunction(WindowConfig config) {
        this.config = config;
    }

    @Override
    public void create() {
        frame = new JFrame(config.title);
        frame.setSize(config.width, config.height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        canvas = new EngineCanvas();     // ← ★生成
        frame.add(canvas);               // ← ★追加
    }

    @Override
    public void show() {
        frame.setVisible(true);
    }

    @Override
    public void close() {
        frame.dispose();
    }

    // ★ getter
    public EngineCanvas getCanvas() {
        return canvas;
    }
}
