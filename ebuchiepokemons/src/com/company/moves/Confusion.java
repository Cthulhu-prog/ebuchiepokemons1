package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Confusion extends PhysicalMove {

    public Confusion() {
        super(Type.NORMAL, 50, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1){
            Effect.confuse(p);
    }}


    @Override
    protected String describe() {
        return "Применяется Confusion";
    }
}