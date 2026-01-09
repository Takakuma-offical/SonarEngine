package project.Component;

import Engine.Core.Component;

public class SampleComponent extends Component {

    @Override
    public void onCreate() {
        System.out.println(
                "SampleComponent attached to " + getGameObject()
        );
    }
}
