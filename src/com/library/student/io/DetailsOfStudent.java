package com.library.student.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.library.constants.Constants;
import com.library.pojo.StudentDetails;

public class DetailsOfStudent {

	public void detailsOfStudent(StudentDetails details) throws IOException {

		File file = new File(Constants.STUDENTFILEPATH + details.getLibraryId() + Constants.EXTENSION);

		if (!file.exists()) {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
			bufferedWriter.write(String.format("%-30s", "Name Of The Student") + "|");
			bufferedWriter.write(String.format("%-30s", "Roll number") + "|");
			bufferedWriter.write(String.format("%-30s", "Branch") + "|");
			bufferedWriter.write(String.format("%-30s", "Studing Year") + "|");
			bufferedWriter.write(String.format("%-15s", "Book Name"+"-"));
			bufferedWriter.write(String.format("%-15s", "Author"));
			bufferedWriter.write("\n");
			bufferedWriter.write(String.format("%-30s", details.getStudentName()) + "|");
			bufferedWriter.write(String.format("%-30s", details.getRollNumber()) + "|");
			bufferedWriter.write(String.format("%-30s", (details.getBranch())) + "|");
			bufferedWriter.write(String.format("%-30s", details.getYear()) + "|");
//			bufferedWriter.write(String.format("%-30s", details.getBookName()) + "-");
//			bufferedWriter.write(String.format("%-30s", details.getBookAuthor()) + "|");
			bufferedWriter.close();
		} else {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
			bufferedWriter.write("\n");
			bufferedWriter.write(String.format("%-30s", details.getStudentName()) + "|");
			bufferedWriter.write(String.format("%-30s", details.getRollNumber()) + "|");
			bufferedWriter.write(String.format("%-30s", (details.getBranch())) + "|");
			bufferedWriter.write(String.format("%-30s", details.getYear()) + "|");
//			bufferedWriter.write(String.format("%-30s", details.getBookName()) + "-");
//			bufferedWriter.write(String.format("%-30s", details.getBookAuthor()) + "|");
			bufferedWriter.close();
		}
	}

}
