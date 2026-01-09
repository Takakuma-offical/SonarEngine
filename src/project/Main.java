package project;

import Engine.Core.Engine_goAdmin;
import Engine.Core.GameLoop;
import Engine.Core.WindowConfig;
import Engine.Core.ConfigLoader;
import Engine.windows.WindowsWindowFunction;
import project.GameObject.GameObject_Sample;
import project.Component.SampleRenderComponent;

public class Main {

    public static void main(String[] args) {

        WindowConfig config =
                ConfigLoader.loadWindowConfig("WindowConfig.config");

        WindowsWindowFunction window =
                new WindowsWindowFunction(config);

        window.create();
        window.show();

        GameObject_Sample sample = new GameObject_Sample();
        Engine_goAdmin.register(sample);
        sample.addComponent(new SampleRenderComponent());

        GameLoop loop = new GameLoop(window.getCanvas());
        new Thread(loop).start();
    }
}
