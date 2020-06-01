package com.otakusaikou.spritcraft.spirit;

public class SpiritCal {
    public static void addWithLimit(Spirit a, Spirit b, Spirit c) {
        a.setMetal(addWithLimit(a.getMetal(), b.getMetal(), c.getMetal()));
        a.setWooden(addWithLimit(a.getWooden(), b.getWooden(), c.getWooden()));
        a.setWater(addWithLimit(a.getWater(), b.getWater(), c.getWater()));
        a.setFire(addWithLimit(a.getFire(), a.getFire(), c.getFire()));
        a.setEarth(addWithLimit(a.getEarth(), a.getEarth(), c.getEarth()));
    }

    private static int addWithLimit(int a, int b, int c) {
        return Math.min((a + b), c);
    }

    public static void sub(Spirit a, Spirit b) {
        a.setMetal(subOreGetZero(a.getMetal(), b.getMetal()));
        a.setWooden(subOreGetZero(a.getWooden(), b.getWooden()));
        a.setWater(subOreGetZero(a.getWater(), b.getWater()));
        a.setFire(subOreGetZero(a.getFire(), b.getFire()));
        a.setEarth(subOreGetZero(a.getEarth(), b.getEarth()));
    }

    private static int subOreGetZero(int a, int b) {
        return Math.max((a - b), 0);
    }

    public static float[] division(Spirit a, Spirit b) {
        return new float[]{a.getMetal() / (float) b.getMetal(), a.getWooden() / (float) b.getWooden(), a.getWater() / (float) b.getWater(), a.getFire() / (float) b.getFire(), a.getEarth() / (float) b.getEarth()};
    }
}
