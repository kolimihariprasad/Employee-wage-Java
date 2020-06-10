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
		int numWorkingDays=0;
		while(numWorkingDays<=TOTAL_WORKING_DAYS && totalHrs<=TOTAL_WORKING_HOURS) {
			int empCheck=(int)Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
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
			if(totalHrs<=TOTAL_WORKING_HOURS) {
				totalHrs+=empHrs;
				numWorkingDays++;
			}
		}
		int totalSalary=totalHrs*EMP_RATE_PER_HR;
		System.out.println(totalSalary);
	}
}
