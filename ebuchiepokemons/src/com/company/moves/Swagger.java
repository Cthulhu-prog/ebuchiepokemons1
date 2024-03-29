package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 1){
            Effect.confuse(p);
        }}
    @Override
    protected String describe() {
        return "Применяется Swagger";
    }

}