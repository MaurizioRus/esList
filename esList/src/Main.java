import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cityNames = Arrays.asList("Roma", "Milano", "Bologna");

        {
            //aslist crea una lista immutabile e non possiamo aggiungere gli elementi cosi
            // cityNames.add("Torino");

            cityNames.set(1, "Tegucigalpa");
            System.out.println("cityNames: " + cityNames);

            List<String> kingsOfRome = new ArrayList<>();

            kingsOfRome.add("Romulus");
            kingsOfRome.add("Numa Pompilius");
            kingsOfRome.add("Tullus Hostilius");
            kingsOfRome.add("Ancus Marcius");
            kingsOfRome.add("Tarquin the Elder");
            kingsOfRome.add("Servius Tullius");
            kingsOfRome.add("Tarquin the Proud");

            System.out.println("kingsOfRome: " + kingsOfRome);

            String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

            kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

            System.out.println("kingsOfRomeArray: " + Arrays.toString(kingsOfRomeArray));
        }
    }
}