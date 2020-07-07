package com.company;

public class Magic extends Hero implements HavingSuperAbility {
    public Magic(int health, int damage, String superabilityType) {
        super(health, damage, superabilityType);

    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Health_of_Magic " + " " + getHealth() + " " + "Damage_of_Magic " + " " + getDamage() + " " + "Супер умение Magic " + " " + getSuperAbilityType());
    }
}
