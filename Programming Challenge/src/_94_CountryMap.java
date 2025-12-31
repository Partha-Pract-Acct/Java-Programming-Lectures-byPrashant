/*
Create a Map where the keys are country names (as String) and the values are their capitals (also String).
Populate the map with at least five countries and their capitals. Write a program that prompts the user to enter
a country name and then displays the corresponding capital, if it exists in the map
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _94_CountryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bangladesh", "Dhaka");
        countryMap.put("India", "New Delhi");
        countryMap.put("China", "Beijing");
        countryMap.put("Russia", "Moscow");
        countryMap.put("Australia", "Canberra");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the country name: ");
        String country = input.next();

        if (countryMap.containsKey(country)) {
            System.out.printf("Capital of %s is %s", country, countryMap.get(country));
        } else  {
            System.out.printf("Capital of %s is NOT found", country);
        }
    }
}
