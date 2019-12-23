package com.company.moves;
import ru.ifmo.se.pokemon.*;
public class FuryAttack extends PhysicalMove {

    public FuryAttack() {
        super(Type.NORMAL, 15, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.375).attack(30));
        p.addEffect(new Effect().chance(0.375).attack(45));
        p.addEffect(new Effect().chance(0.125).attack(60));
        p.addEffect(new Effect().chance(0.125).attack(75));
    }

    @Override
    protected String describe() {
        return "Применяется FuryAttack";
    }
}