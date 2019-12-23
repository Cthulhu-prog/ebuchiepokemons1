package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.*;

public class Ariados extends Spinarak {

    public Ariados(String name, int level) {
        super(name, level);
        this.setType(Type.BUG, Type.POISON);
        this.setStats(70, 90, 70, 60, 70, 40);
        this.addMove(new FeintAttack());
    }
}
