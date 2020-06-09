public class EmpWageBuilderUC1 {
	public static void main(String[] args){
		int IS_FULL_TIME=2;
		int IS_PART_TIME=1;
		int EMP_RATE_PER_HR=20;
		int empHrs;
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
		int totalSalary=empHrs*EMP_RATE_PER_HR;
		System.out.println(totalSalary);
	}
}
