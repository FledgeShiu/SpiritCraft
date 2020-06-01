package com.otakusaikou.spritcraft.spirit;

public class SpiritLimit extends Spirit {
    public static int SPIRIT_MAX = 256;

    public SpiritLimit() {
        super();
    }

    public SpiritLimit(int metal, int wooden, int water, int fire, int earth) {
        super(metal, wooden, water, fire, earth);
    }
}
