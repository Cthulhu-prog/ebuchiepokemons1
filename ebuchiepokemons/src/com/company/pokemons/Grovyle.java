package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.*;

public class Grovyle extends Treecko {

    public Grovyle(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(50, 65, 45, 85, 65, 95);
        this.addMove(new LowSweep());
    }
}