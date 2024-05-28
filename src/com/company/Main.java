package com.company;

import com.company.enums.Directie;
import com.company.enums.NivelDeVechime;
import com.company.models.Angajat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Angajat> angajati = new ArrayList<>();

        angajati.add(new Angajat("Starsii Marcu", Directie.MANAGEMENT, NivelDeVechime.MAI_PUTIN_DE_UN_AN, 10000));
        angajati.add(new Angajat("Negara Nicolae", Directie.JURIDIC, NivelDeVechime.UNU_LA_TREI_ANI, 5000));
        angajati.add(new Angajat("Olari Denis", Directie.VANZARI, NivelDeVechime.TREI_LA_CINCI_ANI, 15000));
        angajati.add(new Angajat("Stoiu Mihai", Directie.AUDIT, NivelDeVechime.CINCI_LA_SAPTE_ANI, 7000));
        angajati.add(new Angajat("Turcuman Stanislav", Directie.IT, NivelDeVechime.SAPTE_LA_ZECE_ANI, 12000));
        angajati.add(new Angajat("Bernic Iulian", Directie.MANAGEMENT, NivelDeVechime.MAI_MULT_DE_ZECE_ANI, 8000));
        angajati.add(new Angajat("Cerchez Marius", Directie.IT, NivelDeVechime.CINCI_LA_SAPTE_ANI, 14000));


        for (Angajat angajat : angajati) {
//            System.out.println();
//            System.out.println(angajat);

            System.out.println("Nume : " + angajat.getNume());
            System.out.println("Directie : " + angajat.getDirectie());
            System.out.println("Salariu de Baza : " + angajat.getDirectie().getSalariuDeBaza());
            System.out.println("\tRata Bonus : " + angajat.getDirectie().getRataBonus() * 100 + "%");
            System.out.println("\tVolum vanzari : " + angajat.getVolumVanzari());
            System.out.println("\tBonus Vanzari : " + angajat.calculeazaBonusVanzari());
            System.out.println("Nivel de vechime : " + angajat.getNivelDeVechime());
            System.out.println("\tRata Vechime : " + angajat.getNivelDeVechime().getRataVechime() * 100 + "%");
            System.out.println("\tBonus Vechime : " + angajat.calculeazaBonusVechime());
            System.out.println("Salariu Final : " + angajat.calculeazaSalariu());
            System.out.println();
        }
    }
}