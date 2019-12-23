package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.*;


public class Sigilyph extends Pokemon {

        public Sigilyph(String name, int level) {
            super(name, level);
            this.setType(Type.PSYCHIC, Type.FLYING);
            this.setStats(72, 58, 80, 103, 80, 97);
            this.addMove(new DoubleTeam());
            this.addMove(new CalmMind());
            this.addMove(new Confusion());
            this.addMove(new Facade());
        }
    }