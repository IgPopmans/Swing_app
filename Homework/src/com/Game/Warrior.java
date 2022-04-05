package com.Game;

public class Warrior extends Player {
    String armor;


    public Warrior(int hp, int level, String type, String weapon, String armor) {
        super(hp, level, type, weapon);
        this.armor = armor;

    }

    @Override
    public String getInfo() {
        return hp + " " + level + " " + type + " " + weapon + " " + armor;

    }

    @Override
    void levelUp() {
        level++;

    }

    @Override
    boolean doDamage() {
        return true;
    }
}
