package OOPS;

class Employee{
	long employeeId,employeePhone;
	String employeeName,employeeAddress;
	double basicSalary,specialAllowance=250.80,Hra=1000.50;
	
	
	public Employee(long employeeId, String employeeName, String employeeAddress,long employeePhone)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeAddress=employeeAddress;
		this.employeePhone=employeePhone;
		
		
	}
	public void calculateSalary(double specialAllowance,double basicSalary)
	{
		double salary;
		salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		System.out.println("salary"+salary);
	}
	public void calculateTransportAllowance(double basicSalary) {
		double transportAllowance=(10/100*basicSalary);
		System.out.println("transportAllowance is:"+transportAllowance);
	}
	
}
class Manager extends Employee{
	
	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary=basicSalary;
		
	}
	
    public void calculateTransportAllowance() {
        double transportAllowance = (15.0 / 100 * basicSalary);
        System.out.println("Transport Allowance: " + transportAllowance);
    }

	public String toString() {
		return "Manager [employeeId=" + employeeId + ", employeePhone=" + employeePhone + ", employeeName="
				+ employeeName + ", employeeAddress=" + employeeAddress + ", basicSalary=" + basicSalary + "]";
	}
	
	
	
	
	
}

class Trainee extends Employee{
	
	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone,double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary=basicSalary;
		
	}

	public String toString() {
		return "Manager [employeeId=" + employeeId + ", employeePhone=" + employeePhone + ", employeeName="
				+ employeeName + ", employeeAddress=" + employeeAddress + ", basicSalary=" + basicSalary + "]";
	}
}
	
	
	
	
	
public  class InheritanceActivity {

	public static void main(String[] args) {
	//test case 1:	
	Manager man1=new Manager(126534,"Peter","Chennai India", 237844, 65000);
	System.out.println(man1);
	man1.calculateSalary(3456, 34534);
	man1.calculateTransportAllowance();
	
	//test case 2:
	 Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
     trainee.calculateSalary(4565, 4534);
     trainee.calculateTransportAllowance(45667);
		
	
		

	}

}
