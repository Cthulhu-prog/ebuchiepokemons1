package com.company;

import com.company.pokemons.Ariados;
import com.company.pokemons.Grovyle;
import com.company.pokemons.Sceptile;
import com.company.pokemons.Spinarak;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Spinarak p1 = new Spinarak("Чужой", 1);
        Pokemon p2 = new Ariados("Хищник", 1);
        Pokemon p3 = new Grovyle("Чужой", 1);
        Pokemon p4 = new Sceptile("Хищник", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.go();
    }
}
