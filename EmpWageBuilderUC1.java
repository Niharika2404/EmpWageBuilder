public class EmpWageBuilderUC1 {

	public static void main(String[] args)
	{
		int WAGE_PER_HR = 20;
		int FULL_DAY_HR = 8;
		int PART_TIME_HR = 0;
		int MONTHLY_WORKED_HR = 20;
		double DAILY_PAYMENT = 0.0;
		double MONTHLY_PAYMENT = 0.0;
				double empCheck = Math.floor(Math.random() * 10) % 2;
			switch (empCheck)
				{
					case FULL_DAY_HR:
						{
							System.out.println("Employee is present");
							DAILY_PAYMENT = FULL_DAY_HR * WAGE_PER_HR;
							MONTHLY_PAYMENT = DAILY_PAYMENT * MONTHLY_WORKED_HR;
							break;
						}
					case PART_TIME_HR:
						{
							System.out.println("Employee is Present");
							DAILY_PAYMENT = FULL_DAY_HR * WAGE_PER_HR * PART_TIME_HR;
							MONTHLY_PAYMENT = DAILY_PAYMENT * MONTHLY_WORKED_HR;
							break;
						}
					default:
							{
							System.out.println("Employee is absent");
							break;
							}
				}
				System.out.println("Daily Payment: " + DAILY_PAYMENT);
	}
}
