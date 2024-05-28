package com.company.enums;

public enum Directie {
    MANAGEMENT(15000,0.30),
    JURIDIC(10000,0.05),
    VANZARI(7000, 0.15),
    AUDIT(12000, 0.10),
    IT(14000, 0.25);

    private final int salariuDeBaza;
    private final double rataBonus;

    Directie(int salariuDeBaza, double rataBonus) {
        this.salariuDeBaza = salariuDeBaza;
        this.rataBonus = rataBonus;
    }

    public int getSalariuDeBaza() {
        return salariuDeBaza;
    }

    public double getRataBonus() {
        return rataBonus;
    }

//    @Override
//    public String toString() {
//        return "Directie{" +
//                "salariuDeBaza=" + salariuDeBaza +
//                ", rataBonus=" + rataBonus +
//                '}';
//    }
}
