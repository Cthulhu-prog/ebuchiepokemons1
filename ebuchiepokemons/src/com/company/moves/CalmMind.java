package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends PhysicalMove {

    public CalmMind() {
        super(Type.PSYCHIC, 0, 0);

    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.ATTACK, +1).stat(Stat.DEFENSE, +1).turns(-1));
    }

    @Override
    protected String describe() {
        return "Применяется CalmMind";
    }
}


