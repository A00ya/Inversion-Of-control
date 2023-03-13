package Presentation;

import Dao.daoImplementation;
import Metier.metierImplementation;

public class presImplementation {
    public static void main(String[] args) {
        daoImplementation dao = new daoImplementation();
        metierImplementation metier = new metierImplementation();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
