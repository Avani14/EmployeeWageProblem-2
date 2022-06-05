public class WageCalculationWithSwitch extends PresentAbsent implements ISolvingWithSwitch{
static int dailyWage;
    @Override
    public int wageWithSwitch(int day, int wage) {

        switch (presentOrAbsent())
        {
            case 1:
                dailyWage = day*wage;
                System.out.println("Employee is present today \n His daily wage is :"+dailyWage+"\n-------------");
                break;
            case 0:
                dailyWage = 0;
                System.out.println("Employee is absent today \n His daily wage is :"+dailyWage+"\n-------------");
                break;
        }
        return dailyWage;
    }
}
