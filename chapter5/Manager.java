package chapter5;

import chapter4.Employee;

public class Manager extends Employee {
	
	private double bouns;//奖金

	public double getBouns() {
		return bouns;
	}

	public void setBouns(double bouns) {
		this.bouns = bouns;
	}
	
	public double getSalary()
	{
		//这里不能访问父类的私有成员变量salary
		return this.bouns + this.getSalary();
	}
	

}
