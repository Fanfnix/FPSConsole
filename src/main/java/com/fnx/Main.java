package com.fnx;

import com.fnx.fpsconsole.Map;
import com.fnx.fpsconsole.RenderUtils;
import com.fnx.fpsconsole.Renderer;

public class Main {
    public static void main(String[] args) {
        Map map = new Map("map.bmp");
        Renderer renderer = new Renderer();
        System.out.println(renderer.render(null, 0, map));
    }
}