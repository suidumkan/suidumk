package com.company;

public class Main {

    public static void main(String[] args) {

        Magic magic = new Magic(8, 35, "Flight");
        Medic medic = new Medic(10, 2, "Heals");
        Warrior warrior = new Warrior(48, 24, "Magical Construction");

        Hero heroes[] = {magic, medic, warrior};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility(heroes.toString());


        }
    }
}
