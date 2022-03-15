package application;

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
		
		System.out.println("=== TEST 1: department findById =====");
		Department department = depDao.findById(9);
		System.out.println(department);

		
		
		sc.close();
	}

}
