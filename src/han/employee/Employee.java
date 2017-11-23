package han.employee;

import han.department.Department;
import han.position.Position;
/**
 * 职员类
 * @author fan
 * 描述职员信息：职员姓名、工号、性别、年龄、所属部门、职务
 */
public class Employee {

	// 职员属性：职员姓名、工号、性别、年龄、所属部门、职务
	private String employeeName;
	private int employeeID;
	private String employeeSex;
	private int employeeAge;
	private Department employeeDepartment;
	private Position employeePosition;
	
	public Employee(){	
	}
	
	public Employee(String employeeName, int employeeID, String employeeSex, int employeeAge, 
			Department employeeDepartment, Position employeePosition){
		this.setEmployeeName(employeeName);
		this.setEmployeeID(employeeID);
		this.setEmployeeSex(employeeSex);
		this.setEmployeeAge(employeeAge);
		this.setEmployeeDepartment(employeeDepartment);
		this.setEmployeePosition(employeePosition);
	}
	
	public void setEmployeeName(String employeeName) {
		if(employeeName == null)
			return;
		else{
			char[] name = employeeName.toCharArray();
			for(char n : name){
				if(n >= 0x4e00 && n <= 0x9bff)
					this.employeeName = employeeName;
				else if((n >= 'a' && n <= 'z') || (n >= 'A' && n <= 'Z'))
					this.employeeName = employeeName;
				else{
					this.employeeName = "(员工姓名有错)";return;
				}		
			}
		}
		
		this.employeeName = employeeName;
	}
	//若姓名属性没有被初始化，给出提示
	public String getEmployeeName() {
		if(this.employeeName == null || this.employeeName == "") 
			this.employeeName = "(姓名未设定!)";
		return this.employeeName;
	}
	
	public String getEmployeeID() {
		if(this.employeeID > 0 && this.employeeID < 10)
			return "S00"+this.employeeID;
		else if(this.employeeID < 100)
			return "S0"+this.employeeID;
		else
			return "S"+this.employeeID;
	}
	//设定员工工号范围：0～200之间
	public void setEmployeeID(int employeeID) {
		if(employeeID < 0 || employeeID > 200)
			this.employeeID = 0;
		else
			this.employeeID = employeeID;
	}
	
	public String getEmployeeSex() {
		return this.employeeSex;
	}
	
	//检查职员性别，只能为“男”或“女”，否则默认设定为“男”
	public void setEmployeeSex(String employeeSex) {
		if((!employeeSex.equals("男")) && (!employeeSex.equals("女")))
			this.employeeSex = "男";
		else
			this.employeeSex = employeeSex;
	}

	public int getEmployeeAge() {
		return this.employeeAge;
	}
	
	//检查职员年龄，只能在18～65之间，否则默认设定为18
	public void setEmployeeAge(int employeeAge) {
		if(this.employeeAge < 18 || this.employeeAge > 65)
			this.employeeAge = 18;
		else
			this.employeeAge = employeeAge;
	}
	
	//员工所属部门，若未被初始化则初始化，并给出未设定信息提示
	public Department getEmployeeDepartment() {
		if(this.employeeDepartment == null) {
			this.employeeDepartment = new Department();
			this.employeeDepartment.setDepartmentName("(部门信息未设定!)");
		}
		return this.employeeDepartment;
	}

	public void setEmployeeDepartment(Department employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	
	//员工职务信息，若未被初始化则初始化，并给出信息提示
	public Position getEmployeePosition() {
		if(this.employeePosition == null) {
			this.employeePosition = new Position();
			this.employeePosition.setPositionName("(职务信息未设定!)");
		}
		return this.employeePosition;
	}

	public void setEmployeePosition(Position employeePosition) {
		this.employeePosition = employeePosition;
	}
	
	//介绍职员信息：姓名、工号、性别、年龄、部门和职务
	public String info(){
		String str = "姓名："+this.getEmployeeName()+"\n工号："+this.getEmployeeID()+"\n性别："+this.getEmployeeSex()
					+"\n年龄："+this.getEmployeeAge()+"\n职务："+this.getEmployeeDepartment().getDepartmentName()
					+this.getEmployeePosition().getPositionName()
					+"\n================================";
		return str;
	}
	
	
}
