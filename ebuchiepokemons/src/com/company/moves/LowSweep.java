package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove {

    public LowSweep() {
        super(Type.FIGHTING, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.SPEED, -1).turns(-1));
    }

    @Override
    protected String describe() {
        return "Применяется LowSweep";
    }
}