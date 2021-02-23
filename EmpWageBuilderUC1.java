public class EmpWageBuilderUC1 {

	public static void main(String[] args)
	{
		int IS_FULL_TIME = 1;
		int WAGE_PER_HR = 20;
		int FULL_DAY_HR = 8;
		int PART_TIME_HR = 0;
		double DAILY_PAYMENT = 0;

				double empCheck = Math.floor(Math.random() * 10) % 2;
			if (empCheck == IS_FULL_TIME)
					{
					System.out.println("Employee is Present");
					System.out.println("DAILY_PAYMENT " + WAGE_PER_HR * (FULL_DAY_HR + PART_TIME_HR));
					}

			else
					{
					System.out.println("Employee is absent");
					System.out.println("DAILY_PAYMENT " + DAILY_PAYMENT);
					}
	}
}
