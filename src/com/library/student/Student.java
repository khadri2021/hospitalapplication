package com.library.student;

import java.io.IOException;
import java.util.Scanner;

import com.library.constants.Constants;
import com.library.pojo.StudentDetails;
import com.library.student.io.DetailsOfStudent;

public class Student {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Student Details");
		System.out.println(Constants.STUDENTNAME);
		String studentName = scanner.next();
		System.out.println(Constants.STUDENTBRANCH);
		String branchName = scanner.next();
		System.out.println(Constants.STUDENTROLLNUMBER);
		String rollNumber = scanner.next();
		System.out.println(Constants.STUDENTSTUDINGYEAR);
		String academicYear = scanner.next();

		String libraryId = branchName.toUpperCase() + Student.UniqueLibraryNumber.libraryID();
		System.out.println("Your Unique Library ID : " + libraryId);
		StudentDetails details = new StudentDetails();
		details.setStudentName(studentName);
		details.setBranch(branchName);
		details.setYear(academicYear);
		details.setRollNumber(rollNumber);
		details.setLibraryId(libraryId);
		DetailsOfStudent detailsOfStudent = new DetailsOfStudent();
		try {

			detailsOfStudent.detailsOfStudent(details);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static class UniqueLibraryNumber {
		public static long libraryID() {
			while (true) {
				int numb = (int) (Math.random() * 1000 * 1000);
				if (String.valueOf(numb).length() == 6)
					return numb;
			}
		}
	}
}
