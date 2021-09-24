package cs246;

import java.util.ArrayList;
import java.util.List;

public class VacationCalculator {

    public static void main(String[] args) {

        VacationCalculator vc = new VacationCalculator();
        // Calculate some vacation costs...
        float japanCost = vc.calculateVacationCost(Destination.Japan, 5);
        float mexicoCost = vc.calculateVacationCost(Destination.Mexico, 3);
        float europeCost = vc.calculateVacationCost(Destination.Europe, 10);

//        System.out.println(japanCost);
        System.out.format(String.format("Total cost for trip to Japan: $%.2f%n", japanCost));
        System.out.format(String.format("Total cost for trip to Mexico: $%.2f%n", mexicoCost));
        System.out.format(String.format("Total cost for trip to Europe: $%.2f%n", europeCost));

    }

    public float calculateVacationCost(Destination dest, int totalNights) {
        {
            //something here
            List<Expense> itinerary = new ArrayList<Expense>();
            itinerary.add(new Cruise(dest));
            itinerary.add(new Dining(dest, totalNights));
            itinerary.add(new Lodging(dest, totalNights));

            float totalCost = tallyExpenses(itinerary);
            return totalCost;
        }
    }

    private float tallyExpenses(List<Expense> expenses){
        float totalCost = 0;
        for(Expense e: expenses){
            totalCost += e.getCost();
        }
        return  totalCost;
    }

}
