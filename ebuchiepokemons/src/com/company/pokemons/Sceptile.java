package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.*;

public class Sceptile extends Grovyle {

    public Sceptile(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS);
        this.setStats(70, 85, 65, 105, 85, 120);
        this.addMove(new RockTomb());
    }
}
