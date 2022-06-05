import java.util.ArrayList;
import java.util.Scanner;

public class Values {
    private final int days;
    private final int hoursMonth;
    private final int wagePerHour;
    private final int hoursPerDay;
    private final int wagePerHourPartTime;
    private final int hoursPerDayPartTime;
    private int option;
    private final String name;

    public Values(int days,int hoursMonth,int wagePerHour,int hoursPerDay,int wagePerHourPartTime,int hoursPerDayPartTime,String name)
    {
        this.days =days;
        this.hoursMonth =hoursMonth;
        this.wagePerHour =wagePerHour;
        this.wagePerHourPartTime =wagePerHourPartTime;
        this.hoursPerDayPartTime =hoursPerDayPartTime;
        this.hoursPerDay =hoursPerDay;
        this.name =name;
    }

    public String toString() {
        return "Details of the company are as folows : \n Name: "+name+" \n Working Days Per Month: "+days+" \n Working hours per month: "+hoursMonth+
                " \n Wage per hour of regular employee: "+wagePerHour+" \n Hours per day of a regular employee: "+hoursPerDay+
                " \n Wage per hour of part time employee: "+wagePerHourPartTime+" \n Hours per day of a part time employee: "+hoursPerDayPartTime;
    }

}
interface IValueInArray{
    public void getDetails(int days,int hoursMonth,int wagePerHour,int hoursPerDay,int wagePerHourPartTime,int hoursPerDayPartTime,String name);
}
