package com.uigitdev.materialcolorbuttons.model;

public class Item {
    private int iconId;
    private String color1;
    private String color2;

    public Item(int iconId, String color1, String color2) {
        this.iconId = iconId;
        this.color1 = color1;
        this.color2 = color2;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }
}
