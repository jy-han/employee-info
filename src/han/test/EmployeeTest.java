package han.test;
import han.department.Department;
import han.employee.Employee;
import han.position.Position;

public class EmployeeTest {

	public static void main(String[] args) {
		// 创建部门类对象：人事部、市场部
		Department departH = new Department(1, "人事部");
		Department departM = new Department(2, "市场部");
		
		// 创建职位类对象：经理、助理、职员
		Position positionM = new Position(1, "经理");
		Position positionA = new Position(2, "助理");
		Position positionE = new Position(3, "职员");
		
		// 创建职员对象
		Employee e1 = new Employee();
		e1.setEmployeeName("张铭");
		e1.setEmployeeID(1);
		e1.setEmployeeSex("男");
		e1.setEmployeeAge(29);
		e1.setEmployeeDepartment(departH);
		e1.setEmployeePosition(positionM);
		System.out.println(e1.info());
		
		Employee e2 = new Employee("李艾爱", 2, "女", 21, departH, positionA);
		System.out.println(e2.info());
		
		Employee e3 = new Employee("孙超", 4, "男", 29, departH, positionE);
		System.out.println(e3.info());
		
		Employee e4 = new Employee("张美美", 5, "女", 26, departM, positionE);
		System.out.println(e4.info());
		
		Employee e5 = new Employee("蓝迪", 6, "男", 37, departM, positionM);
		System.out.println(e5.info());
		
		Employee e6 = new Employee("米莉", 7, "女", 24, departM, positionE);
		System.out.println(e6.info());  
		
		//统计员工人数
		departH.checkEmployeeNum(e1);
		departH.checkEmployeeNum(e2);
		departH.checkEmployeeNum(e3);
		System.out.println(departH.info());   
		
		departM.checkEmployeeNum(e4);
		departM.checkEmployeeNum(e5);
		departM.checkEmployeeNum(e6);
		System.out.println(departM.info());

	}

}
