package org.stdresult;

import java.util.Scanner;

import javax.security.auth.Subject;

import java.util.HashMap;
import java.util.Map;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = "Welcome to Student Result System";
		System.out.println(a);
		System.out.println();
		String names[] = { "SriVarma", "SriSai", "Vicky", "Praveen" };
		for (int i = 0; i <= 3; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		Map<String, String> departmentMap = new HashMap<>();
		departmentMap.put("SriVarma", "Computer Science");
		departmentMap.put("SriSai", "Commerce");
		departmentMap.put("Vicky", "BioChemistry");
		departmentMap.put("Praveen", "Electrical Engineering");

		Map<String, String[]> subjectMap = new HashMap<>();
		subjectMap.put("SriVarma", new String[] { "Maths", "C++", "Python" });
		subjectMap.put("SriSai", new String[] { "Economices", "Computer Application", "English" });
		subjectMap.put("Vicky", new String[] { "BioPhysics", "Cellular BioChemistry", "Metabolism" });
		subjectMap.put("Praveen", new String[] { "Civil", "Fluid Mechanics", "Robotics" });
		boolean ContinueLoop = true;
		while (ContinueLoop) {
			System.out.println("Enter Student name:");
			String name = scanner.nextLine();
			if (name.equalsIgnoreCase("exit")) {
				ContinueLoop = false;
				break;
			}
			String department = departmentMap.get(name);
			String[] subject = subjectMap.get(name);
			if (department != null) {
				System.out.println("Dapartment:" + department);
				String[] subjects = subjectMap.get(name);
				for (String subjects1 : subjects) {
					System.out.println("-" + subjects1);
				}
				System.out.println("Enter marks for each subject:");
				Map<String, Integer> marksMap = new HashMap<>();
				int totalMarks = 0;
				for (String subject2 : subjects) {
					System.out.print(subject2 + ": ");
					int marks = scanner.nextInt();
					marksMap.put(subject2, marks);
					totalMarks += marks;
				}
				System.out.println("\nStudent Result:");
				System.out.println("Name: " + name);
				System.out.println("Department: " + department);
				System.out.println("Marks:");

				for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
					System.out.println("- " + entry.getKey() + ": " + entry.getValue());
				}
			
				System.out.println("Total Mark:" + totalMarks);
			}
		
		    else {
				System.out.println("Student not found or details not available");
				System.out.println("if you want to exit click\"exit\"");
			}
		}
	}
}


