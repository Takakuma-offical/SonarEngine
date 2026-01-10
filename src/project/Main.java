package project;

import Engine.Core.Engine;
import Engine.Core.Engine_goAdmin;
import Engine.Core.WindowConfig;
import Engine.windows.WindowsWindowFunction;
import project.GameObject.GameObject_Sample;
import project.Component.SampleMoveComponent;
import project.Component.SampleRenderComponent;

public class Main {
    public static void main(String[] args) {
        WindowConfig config = new WindowConfig("My Game", 800, 600);
        WindowsWindowFunction window = new WindowsWindowFunction(config);
        window.create();
        window.show();

        Engine.start();

        GameObject_Sample obj = new GameObject_Sample();
        obj.addComponent(new SampleMoveComponent());
        obj.addComponent(new SampleRenderComponent());

        Engine_goAdmin.add(obj);
    }
}
