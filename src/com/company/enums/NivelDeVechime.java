package com.company.enums;

public enum NivelDeVechime {
    MAI_PUTIN_DE_UN_AN(0),
    UNU_LA_TREI_ANI(0.05),
    TREI_LA_CINCI_ANI(0.07),
    CINCI_LA_SAPTE_ANI(0.10),
    SAPTE_LA_ZECE_ANI(0.12),
    MAI_MULT_DE_ZECE_ANI(0.15);

    private final double rataVechime;

    NivelDeVechime(double rataVechime) {
        this.rataVechime = rataVechime;
    }

    public double getRataVechime() {
        return rataVechime;
    }

//    @Override
//    public String toString() {
//        return "NivelDeVechime{" +
//                "rataVechime=" + rataVechime +
//                '}';
//    }
}
