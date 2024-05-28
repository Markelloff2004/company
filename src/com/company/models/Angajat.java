package com.company.models;

import com.company.enums.Directie;
import com.company.enums.NivelDeVechime;
import com.company.interfaces.CalculatorSalariu;

public class Angajat implements CalculatorSalariu {

    private String nume;
    private Directie directie;
    private NivelDeVechime nivelDeVechime;
    private double volumVanzari;

    public Angajat(String nume, Directie directie, NivelDeVechime nivelDeVechime, double volumVanzari) {
        this.nume = nume;
        this.directie = directie;
        this.nivelDeVechime = nivelDeVechime;
        this.volumVanzari = volumVanzari;
    }

    public String getNume() {
        return nume;
    }

    public Directie getDirectie() {
        return directie;
    }

    public NivelDeVechime getNivelDeVechime() {
        return nivelDeVechime;
    }

    public double getVolumVanzari() {
        return volumVanzari;
    }

    @Override
    public double calculeazaSalariu(){
        double salariuDeBaza = directie.getSalariuDeBaza();
        double bonusVechime = this.calculeazaBonusVechime();
        double bonusVanzari = this.calculeazaBonusVanzari();

        return salariuDeBaza + bonusVanzari + bonusVechime;
    }

    @Override
    public double calculeazaBonusVanzari(){
        return volumVanzari * directie.getRataBonus();
    }

    @Override
    public double calculeazaBonusVechime(){
        return directie.getSalariuDeBaza() * nivelDeVechime.getRataVechime();
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", directie=" + directie +
                ", nivelDeVechime=" + nivelDeVechime +
                ", volumVanzari=" + volumVanzari +
                '}';
    }
}
