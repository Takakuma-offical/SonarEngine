package project.Component;

import Engine.Core.Component;

public class SampleMoveComponent extends Component {

    @Override
    public void update() {
        transform.x += 1.0f;
        transform.y += 1.0f;
    }
}
