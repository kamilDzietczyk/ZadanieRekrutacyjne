package com.company;

import java.util.List;

public class ObjectBlock implements Block{

    private String Color;
    private String Material;

    public ObjectBlock(String Color, String Material) {
        this.Color = Color;
        this.Material = Material;
    }

    @Override
    public String getColor() {
        return Color;
    }

    @Override
    public String getMaterial() {
        return Material;
    }

}
