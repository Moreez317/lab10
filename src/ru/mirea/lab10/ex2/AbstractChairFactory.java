package ru.mirea.lab10.ex2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicChair createMagicianChair();
    FunctionalChair createFunctionalChair();
}
