package org.emp;

public class Employee {
	
	public void empID() {
		// TODO Auto-generated method stub
		System.out.println("Employee ID: 0016212");
	}
	
	//polymorphism
	public void empID(int id, int nId, float height) {
		// TODO Auto-generated method stub
		System.out.println("Employee ID:"+id+ "\nt3y87NewId: " + nId);
		System.out.println("Height:"+height);
	}
	
	public void empID(int age, float weight, int mobile) {
		
	System.out.println("Age"+age);	
	System.out.println("Mobile"+mobile);
	System.out.println("Weight:"+weight);
	}
	public void empName() {
		
		System.out.println("Employee Name: VIJI");
	}
	public void empDob() {
		
		System.out.println("Employee DoB: 16/05/1999");
	}
	public void empPhone() {
		
		System.out.println("Employee Phone Number: 0016212");
	}

	public void empEmail() {
		
		System.out.println("Employee Email Id: vgghjcxh@gmail.com");
	}
	public void empAddress() {
		
		System.out.println("Employee Address: xxxx");
	}
	
	public static void main(String[] args) {
		Employee ob = new Employee();
		
		ob.empID();
		//ob.empID(1234566);
		ob.empID(1234786, 4587899, 5.5f);
		
		ob.empName();
		ob.empDob();
		ob.empPhone();
		ob.empEmail();
		ob.empAddress();
		Employee o = new Employee();
		o.empID(45, 68.9f, 636965219);
	}
}
