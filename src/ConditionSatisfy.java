public class ConditionSatisfy {

    public static final int MAX_HOURS_IN_MONTH = 100;
    public static final int MAX_DAYS_IN_MONTH = 20;

    public void condition(int option) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        int empWage = 0;
        while (empHrs < MAX_HOURS_IN_MONTH && totalWorkingDays < MAX_HOURS_IN_MONTH) {
            totalWorkingDays++;

            switch (option) {
                case 2:
                    empHrs = 4;
                    empWage = 10;
                    break;
                case 1:
                    empHrs = 8;
                    empWage = 20;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs+=empHrs;
        }
        int totalEmpWage = totalEmpHrs*empWage;
        System.out.println("Condition Satisfies");
        System.out.println("The employee wage is :"+totalEmpWage);

    }
}
