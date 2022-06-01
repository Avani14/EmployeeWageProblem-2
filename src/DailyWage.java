public class DailyWage extends PresentAbsent implements IWageCalculation{
    static int dailyWage;
    @Override

    public int wageOfEmp(int day, int wage,int hours) {

        if(presentOrAbsent()==1)
        {
            dailyWage= wage*hours;
            System.out.println("Employee is present \n  His daily wage is "+dailyWage);
        }
        else {
            System.out.println("Employee is absent  \n  His daily wage is 0");
            dailyWage=0;
        }

        return dailyWage;

    }

}