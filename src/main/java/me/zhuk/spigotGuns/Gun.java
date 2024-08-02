package me.zhuk.spigotGuns;

import org.bukkit.Material;

public enum Gun {

    AKM(10, 30, "AKM", Material.CYAN_DYE),
    GLOCK(5, 8, "Glock", Material.INK_SAC);


    private double damage;
    private int bulletsNum;
    private String name;
    private Material gunMaterial;

    Gun (double damage, int bulletsNum, String name, Material gunMaterial) {
        this.damage = damage;
        this.bulletsNum = bulletsNum;
        this.name = name;
        this.gunMaterial = gunMaterial;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getBulletsNum() {
        return bulletsNum;
    }

    public void setBulletsNum(int bulletsNum) {
        this.bulletsNum = bulletsNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getGunMaterial() {
        return gunMaterial;
    }

    public void setGunMaterial(Material gunMaterial) {
        this.gunMaterial = gunMaterial;
    }
}
