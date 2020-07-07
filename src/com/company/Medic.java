package com.company;

public class Medic extends Hero implements HavingSuperAbility {
    public Medic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Health_of_Medic " + " " + getHealth() + " " + "Damage_of_Medic " + " " + getDamage() + " " + "Супер умения Medic " + " " + getSuperAbilityType());

    }
}
