import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    static int days;
    static int hoursMonth;
    static int wagePerHour;
    static int hoursPerDay;
    static int wagePerHourPartTime;
    static int hoursPerDayPartTime;
    static int option;
    static String name;

    public static void main(String[] args) {

        System.out.println("Welcome to employee wage computation!");

        System.out.println("Enter 1 to enter the company details");
        System.out.println("Enter 2 to get the details of the company");
        System.out.println("Enter 0 to exit the Employee wage computation");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.nextLine();
        while(option != 0) {
            switch (option) {
                case 1:
                    System.out.println("Enter the name of your company ");
                    name = sc.nextLine();

                    System.out.println("Enter company working days in a month ");
                    days = sc.nextInt();

                    System.out.println("Enter total hours per month ");
                    hoursMonth = sc.nextInt();

                    System.out.println("Enter company wage for one hour ");
                    wagePerHour = sc.nextInt();

                    System.out.println("Enter company working hours one day ");
                    hoursPerDay = sc.nextInt();

                    System.out.println("Enter company wage for one hour for a part time employee");
                    wagePerHourPartTime = sc.nextInt();

                    System.out.println("Enter company working hours one day for a part time employee ");
                    hoursPerDayPartTime = sc.nextInt();
                    break;
                case 2:
                    GetValues gv = new GetValues();
                    gv.getDetails(days, hoursMonth, wagePerHour, hoursPerDay, wagePerHourPartTime, hoursPerDayPartTime, name);
                case 0:
                    break;

            }
        }


        System.out.println("Enter 1 to check the details of regular employee and enter 2 to check the details of part time/intern's details.");
        option = sc.nextInt();

        Values v = new Values(days,  hoursMonth,  wagePerHour,  hoursPerDay,  wagePerHourPartTime,  hoursPerDayPartTime,  name);


        IPresentOrAbsent c = new PresentAbsent();
        System.out.println(c.presentOrAbsent());
        IWageCalculation wc = new DailyWage();
        ISolvingWithSwitch solveWithSwitch = new WageCalculationWithSwitch();
        MonthlyWage mw = new MonthlyWage();
        ConditionSatisfy cs = new ConditionSatisfy();
        if(option == 1)
        {
            wc.wageOfEmp(hoursPerDay,wagePerHour,hoursPerDay);
            System.out.println("----Solving with switch statement----");
            solveWithSwitch.wageWithSwitch(hoursPerDay,wagePerHour);
            mw.wageOfEmp(days,wagePerHour,hoursPerDay);
            cs.condition(1);

        }
        else if(option == 2)
        {
            wc.wageOfEmp(hoursPerDayPartTime,wagePerHourPartTime,hoursPerDay);
            System.out.println("----Solving with switch statement----");
            solveWithSwitch.wageWithSwitch(hoursPerDayPartTime,wagePerHourPartTime);
            mw.wageOfEmp(days,wagePerHourPartTime,hoursPerDayPartTime);
            cs.condition(2);
        }


    }
}

interface IPresentOrAbsent
{
    int presentOrAbsent();

}
interface IWageCalculation
{
    int wageOfEmp(int day,int wage,int hours);
}

interface ISolvingWithSwitch
{
    int wageWithSwitch(int day,int wage);
}
