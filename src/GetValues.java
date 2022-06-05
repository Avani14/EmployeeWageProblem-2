import java.util.ArrayList;

public class GetValues implements IValueInArray {
    @Override
    public void getDetails(int days, int hoursMonth, int wagePerHour, int hoursPerDay, int wagePerHourPartTime, int hoursPerDayPartTime, String name) {
        Values v = new Values(days, hoursMonth, wagePerHour, hoursPerDay, wagePerHourPartTime, hoursPerDayPartTime, name);
        ArrayList<Values> arrayOfValues = new ArrayList<>();
        arrayOfValues.add(v);
        for(Values values : arrayOfValues)
        {
            System.out.println(values);
        }

    }
}
