package Engine.Core;

import Engine.Graphics.RenderContext;

public abstract class RenderComponent extends Component {

    public abstract void onRender(RenderContext ctx);
}
