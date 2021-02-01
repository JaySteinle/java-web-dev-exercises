package org.launchcode.java.demos.lsn7interfaces;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
//        Comparator comparator = new FlavorComparator();

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        flavors.sort(new FlavorComparator());
        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Flavor types:");
        for (int i = 0; i < flavors.size(); i ++){
            System.out.println(flavors.get(i));
        }

        System.out.println("\n");
        System.out.println("Cone types:");
        for (int i = 0; i < cones.size(); i ++){
            System.out.println(cones.get(i));
        }
    }


}

