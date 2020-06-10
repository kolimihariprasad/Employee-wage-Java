public class EmpWageBuilderUC1 {
	public static void main(String[] args){
		//Constants
		int IS_FULL_TIME=2;
		int IS_PART_TIME=1;
		int EMP_RATE_PER_HR=20;
		int TOTAL_WORKING_DAYS=20;
		int TOTAL_WORKING_HOURS=100;
		//Variables
		int empHrs;
		int totalHrs=0;
		int NumWorkingDays=0;
		while(NumWorkingDays<=TOTAL_WORKING_DAYS && totalHrs<=TOTAL_WORKING_HOURS) {
			double empCheck=Math.floor(Math.random() * 10) % 3;
			switch ((int)empCheck) {
				case 2:
					empHrs=8;
					break;
				case 1:
					empHrs=4;
					break;
				default:
					empHrs=0;
					break;
			}
			totalHrs+=empHrs;
			NumWorkingDays++;
		}
		int totalSalary=totalHrs*EMP_RATE_PER_HR;
		System.out.println(totalSalary);
	}
}
