package project.Component;

import Engine.Core.RenderComponent;
import Engine.Graphics.RenderContext;

import java.awt.Color;

public class SampleRenderComponent extends RenderComponent {

    @Override
    public void onRender(RenderContext ctx) {
        ctx.getGraphics().setColor(Color.RED);
        ctx.getGraphics().fillRect(50, 50, 100, 100);
    }
}
