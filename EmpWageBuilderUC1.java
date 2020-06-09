public class EmpWageBuilderUC1 {
	public static void main(String[] args){
		int IS_FULL_TIME=2;
		int IS_PART_TIME=1;
		int EMP_RATE_PER_HR=20;
		int TOTAL_WORKING_DAYS=20;
		int empHrs;
		int totalHrs=0;
		int NUM_WORKING_DAYS=0;
		while(NUM_WORKING_DAYS<=TOTAL_WORKING_DAYS) {
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
			NUM_WORKING_DAYS++;
		}
		int totalSalary=totalHrs*EMP_RATE_PER_HR;
		System.out.println(totalSalary);
	}
}
