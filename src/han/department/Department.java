package han.department;

import han.employee.Employee;

/**
 * 部门类
 * @author fan
 * 描述部门编号、部门名称、员工人数的情况
 */
public class Department {
	//成员属性：部门编号、部门名称、员工数组、员工人数
	private int departmentNo;
	private String departmentName;
	private Employee[] employee;
	private int employeeNum;
	
	public Department(){
	}
	
	public Department(int departmentNo, String departmentName) {
		this.setDepartmentNo(departmentNo);
		this.setDepartmentName(departmentName);
	}

	public String getDepartmentNo() {
		return "D"+departmentNo;
	}

	//设定部分编号范围：0～50之间
	public void setDepartmentNo(int departmentNo) {
		if(departmentNo < 0 || departmentNo > 50)
			this.departmentNo = 0;
		else
			this.departmentNo = departmentNo;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	//员工数组，调用方法时若未被初始化，则初始化为100	
	public Employee[] getEmployee() {
		if(this.employee == null)
			this.employee = new Employee[100];
		return employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}

	public int getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}

	/* 统计部门人数的方法
	 * 将员工放入员工数组，并进行统计
	 */
	public void checkEmployeeNum(Employee employee){
		for(int i = 0; i < this.getEmployee().length; i++){
			if(this.getEmployee()[i] == null && employee.getEmployeeDepartment().getDepartmentName() == this.getDepartmentName()){
				this.getEmployee()[i] = employee;
				employee.setEmployeeDepartment(this);
				this.setEmployeeNum(i+1);return;
				}
			}
	}

	//介绍部门人数的方法
	public String info(){
		String str = this.getDepartmentName()+"总共有"+this.getEmployeeNum()+"名员工";
		return str;
	}
}
