package com.fouadev.pres;

import com.fouadev.dao.DaoImpl;
import com.fouadev.metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao); // MetierImpl metier = new MetierImpl(dao); => injection via le constructeur
        //metier.setDao(dao); // injection dependence using instance static
        System.out.println("Res="+metier.calcul());
    }
}
