package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.*;


public class Treecko extends Pokemon {

    public Treecko(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(40, 45, 35, 65, 55, 70);
        this.addMove(new FeintAttack());
        this.addMove(new Rest());
    }
}