package offset.offset9;

import java.util.ArrayList;

public class Logic {
    private static ArrayList<Appliance> allAppliancesTurnedOn = new ArrayList<>();
    private static ArrayList<Appliance> allAppliances = new ArrayList<>();

    public static ArrayList<Appliance> getAllAppliancesTurnedOn() {
        return allAppliancesTurnedOn;
    }

    public static ArrayList<Appliance> getAllAppliances() {
        return allAppliances;
    }

    public static int totalPower () {
        int result = 0;
        for (Appliance i : allAppliancesTurnedOn) {
            result += i.getPower();
        }
        return result;
    }

//    public static void sort () {       //мде.. так гораздо легче сортировать ))
//        Collections.sort(allAppliances, Comparator.comparing(Appliance::getPower).reversed());
//    }

    public static void sort () {
        Appliance temp;
        for (int i = 0; i < allAppliances.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < allAppliances.size(); j++) {
                if (allAppliances.get(j).getPower() < allAppliances.get(minIndex).getPower()) {
                    minIndex = j;
                }
            }

            temp = allAppliances.get(minIndex);
            allAppliances.set(minIndex, allAppliances.get(i));
            allAppliances.set(i, temp);
        }
    }

    public static ArrayList<Appliance> findAppliance (int min, int max) {
        ArrayList<Appliance> result = new ArrayList<>();
        for (Appliance i : allAppliances) {
            if(i.getPower() >= min && i.getPower() <= max) {
                result.add(i);
            }
        }
        return result;
    }
}