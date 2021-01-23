package LearingJava;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMappMain {
    public static void main(String[] args) {
        Country india = new Country("India",13000000);
        Country australia = new Country("Australia",10000);

        Country england = new Country("England",140000);
        Country germany = new Country("Germany",11000);

        HashMap<Country, String> countryCapitalMap = new HashMap<Country, String>();
        countryCapitalMap.put(india,"Delhi");
        countryCapitalMap.put(australia,"Canberra");
        countryCapitalMap.put(england,"London");
        countryCapitalMap.put(germany,"Berlin");

        System.out.println("Sorting HashMap by passing it to TreeMap constructor");

        TreeMap<Country, String> sortedTreeMapCountryCapital = new TreeMap<Country,String>(countryCapitalMap);

        for (Country countryKey:sortedTreeMapCountryCapital.keySet()) {
            System.out.println(countryKey.name + " and  Capital:" + sortedTreeMapCountryCapital.get(countryKey));
        }
    }
}
