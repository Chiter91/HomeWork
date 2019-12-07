package assessment.assessment6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Bouquet {
    public static ArrayList<Flowers> bouquetList = new ArrayList<>();
    public static Set<Color> allColor = new HashSet<>();

    public static String getAllColor() {
        StringBuilder result = new StringBuilder();
        for(Color i : allColor)
            result.append(" ").append(i.getColor());
        return result.toString();
    }

    public static double totalCount () {
        double result = 0;
        for (Flowers i : bouquetList)
            result += i.getCost();
        return result;
    }

    public static int lifeSpan () {
        int result = 0;
        for(Flowers i : bouquetList) {
            if(result < i.getLifeDay())
                result = i.getLifeDay();
        }
        return result;
    }
}