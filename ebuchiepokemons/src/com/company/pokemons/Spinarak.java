package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.*;


public class Spinarak extends Pokemon {

    public Spinarak(String name, int level) {
        super(name, level);
        this.setType(Type.POISON, Type.BUG);
        this.setStats(72, 58, 80, 103, 80, 97);
        this.addMove(new SteelWing());
        this.addMove(new Swagger());
        this.addMove(new FuryAttack());
    }
}