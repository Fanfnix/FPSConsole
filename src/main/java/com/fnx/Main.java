package com.fnx;

import com.fnx.fpsconsole.Map;
import com.fnx.fpsconsole.RenderUtils;
import com.fnx.fpsconsole.Renderer;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Map map = new Map("map.bmp");
        Renderer renderer = new Renderer();
        System.out.println(renderer.render(new Point(50, 50), 270, map));
    }
}