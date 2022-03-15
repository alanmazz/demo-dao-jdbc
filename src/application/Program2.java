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
		
	/*	System.out.println("\n=== TEST 1: department insert=====");
		Department newDep = new Department(9, "Music");
		depDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId()); */
		
		System.out.println("=== TEST 2: department findById =====");
		Department department = depDao.findById(9);
		System.out.println(department);
		
		System.out.println("\n=== TEST 3: department findAll=====");
		List<Department> list = depDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		
		
		sc.close();
	}

}
