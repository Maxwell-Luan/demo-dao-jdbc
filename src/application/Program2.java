package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		List<Department> list = departmentDao.findAll();
		
		System.out.println("\n=== TEST 1: department findAll ===");
		list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj.getId() + ": " + obj.getName());
		}
		
		System.out.println("\n=== TEST 2: department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 3: department insertDepartment ===");
		Department dep1 = new Department(null, "Clocks");
		departmentDao.insert(dep1);
		System.out.println("Department added. New id: " + dep1.getId());
	}

}
