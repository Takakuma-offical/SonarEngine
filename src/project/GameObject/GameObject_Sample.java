package project.GameObject;

import Engine.Core.Component;
import Engine.Core.GameObject;

import java.util.ArrayList;
import java.util.List;

public class GameObject_Sample implements GameObject {

    private final List<Component> components = new ArrayList<>();

    @Override
    public List<Component> getComponents() {
        return components;
    }

    @Override
    public void onCreate() {
        System.out.println("Sample GameObject created");
    }
}
