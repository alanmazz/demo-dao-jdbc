package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById =====");
		Department department = depDao.findById(9);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department findAll=====");
		List<Department> list = depDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

	/*	System.out.println("\n=== TEST 3: department insert=====");
		Department newDep = new Department(9, "Music");
		depDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId()); */
		
		System.out.println("\n=== TEST 4: department update=====");
		department = depDao.findById(8);
		department.setName("Marketing");
		depDao.update(department);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 5: department deleteById=====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		depDao.deletebyId(id);
		System.out.println("Delete completed!");
		
		
		
		sc.close();
	}

}
