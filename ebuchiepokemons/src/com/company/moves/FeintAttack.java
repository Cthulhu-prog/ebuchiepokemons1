package com.company.moves;


import ru.ifmo.se.pokemon.*;

public class FeintAttack extends PhysicalMove {

    public FeintAttack() {
        super(Type.DARK, 60, 1.0/0.0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.ACCURACY, 0).turns(0));
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.EVASION, 0).turns(0));
    }

    @Override
    protected String describe() {
        return "Применяется FeintAttack";
    }
}