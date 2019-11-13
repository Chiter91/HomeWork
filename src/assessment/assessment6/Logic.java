package assessment.assessment6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Logic {
    static ArrayList<Flowers> bouquet = new ArrayList<>();
    static Set<Color> allColor = new HashSet<>();

    public static String getAllColor() {
        StringBuilder result = new StringBuilder();
        for(Color i : allColor)
            result.append(" ").append(i);
        return result.toString();
    }

    public static double totalCount () {
        double result = 0;
        for (Flowers i : bouquet)
            result += i.getCost();
        return result;
    }

    public static int lifeSpan () {
        int result = 0;
        for(Flowers i : bouquet) {
            if(result < i.getLifeDay())
                result = i.getLifeDay();
        }
        return result;
    }
}