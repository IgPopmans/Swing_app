package com.Game;

public class Wizard extends Player {
    int mannaLevel;
    String element;


    public Wizard(int hp, int level, String type, String weapon, int mannaLevel, String element) {
        super(hp, level, type, weapon);
        this.mannaLevel = mannaLevel;
        this.element = element;
    }

    @Override
    public String getInfo() {
        return hp + " " + level + " " + type + " " + weapon + " " + mannaLevel + " " + element;

    }

    @Override
    void levelUp() {
        level++;


    }

    @Override
    boolean doDamage() {
        if (mannaLevel >= 10) {
            mannaLevel -= 10;
            return true;
        }
        return false;


    }
}
