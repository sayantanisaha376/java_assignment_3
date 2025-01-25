package com.example;

 class EmpSal{

	    // Employee class with name and salary
	    
	        String name;
	        double salary;
	    

	    // Method to initialize the employee data
	    public static EmpSal[] initializeEmpSal() {
	        EmpSal[] employees = new EmpSal[3];

	        // Initializing the Employee objects
	        employees[0] = new EmpSal();
	        employees[0].name = "Sayantani";
	        employees[0].salary = 2500;

	        employees[1] = new EmpSal();
	        employees[1].name = "Ankita";
	        employees[1].salary = 5000;

	        employees[2] = new EmpSal();
	        employees[2].name = "Poulomi";
	        employees[2].salary = 3000;

	        return employees;
	    }

	    // Method to find the employee with the highest salary
	    public static EmpSal findHighestSalary(EmpSal[] employees) {
	        EmpSal highestSalary = employees[0];

	        for (int i = 1; i < employees.length; i++) {
	            if (employees[i].salary > highestSalary.salary) {
	                highestSalary = employees[i];
	            }
	        }

	        return highestSalary;
	    }

	    public static void main(String[] args) {
	        // Calling the method to initialize the Employee objects
	        EmpSal[] employees = initializeEmpSal();

	        // Calling the method to find the employee with the highest salary
	        EmpSal highestSalaryEmployee = findHighestSalary(employees);

	        // Print the name and salary of the employee with the highest salary
	        System.out.println("The employee with the highest salary is: " 
	                           + highestSalaryEmployee.name + " with Salary " 
	                           + highestSalaryEmployee.salary);
	    }
	

	    
	}

