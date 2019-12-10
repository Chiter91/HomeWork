package assessment.assessment6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bouquet {

    private List<Flowers> listBouquet = new ArrayList<>();
    private Set<Color> listAllColor = new HashSet<>();

    public void add (Flowers flowers) {
        listBouquet.add(flowers);
        listAllColor.add(flowers.getColor());
    }

    public List<Flowers> getListBouquet () {
        return listBouquet;
    }

    public String getAllColor() {
        StringBuilder result = new StringBuilder();
        for(Color i : listAllColor)
            result.append(" ").append(i.getColor());
        return result.toString();
    }

    public double totalCount () {
        double result = 0;
        for (Flowers i : listBouquet)
            result += i.getCost();
        return result;
    }

    public int lifeSpan () {
        int result = 0;
        for(Flowers i : listBouquet) {
            if(result < i.getLifeDay())
                result = i.getLifeDay();
        }
        return result;
    }
}