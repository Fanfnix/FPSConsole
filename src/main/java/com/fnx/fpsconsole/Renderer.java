package com.fnx.fpsconsole;

import java.awt.*;

public class Renderer {
    private final Screen screen = new Screen(RenderUtils.SCREEN_HEIGHT, RenderUtils.SCREEN_WIDTH);

    public String render(final Point origin, final int direction, final Map map) {
        final double[] heightsPerceived = this.getHeightsPerceived(origin, direction, map);
        int numColumn = 0;
        for (final double heightPerceived : heightsPerceived) {
            this.renderColumn(numColumn++, heightPerceived);
        }
        return this.screen.toStr();
    }


    private void renderColumn(final int numColumn, final double heightPerceived) {
        this.screen.verticalLine(numColumn, 0, (int)(RenderUtils.EYE_HEIGHT - heightPerceived/2), RenderUtils.GROUND_PIXEL);
        this.screen.verticalLine(numColumn, (int)(RenderUtils.EYE_HEIGHT - heightPerceived/2), (int)(RenderUtils.EYE_HEIGHT + heightPerceived/2), RenderUtils.WALL_PIXEL);
        this.screen.verticalLine(numColumn, (int)(RenderUtils.EYE_HEIGHT + heightPerceived/2), RenderUtils.SCREEN_HEIGHT, RenderUtils.SKY_PIXEL);
    }


    private double[] getHeightsPerceived(final Point origin, final int direction, final Map map) {
        final double[] heightsPerceived = new double[RenderUtils.SCREEN_WIDTH];
        for (int column = 0; column < RenderUtils.SCREEN_WIDTH; column++) {
            heightsPerceived[column] = Math.min(column / 4, 20);
        }
        return heightsPerceived;
    }
}
