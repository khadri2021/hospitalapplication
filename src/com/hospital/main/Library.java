package com.hospital.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Library {
	public static void main(String[] args) throws IOException  {
		
	BufferedWriter printwriter=new BufferedWriter(new FileWriter("F:\\harshini\\work\\Task\\Library\\I year.txt"));
	//printwriter.write("Book name :");
	//printwriter.write("Author");

	Scanner sc = new Scanner(System.in);
	System.out.println("How many books are you store");
  int Librarybooks=sc.nextInt();
	for (int i = 0; i<Librarybooks; i++) {
        System.out.println("book name");
		String bookname=sc.next();
		printwriter.write("Book Name :"+bookname+"\n");
		System.out.println("Author");
		String author=sc.next();
		printwriter.write("Author :"+author);

		System.out.println("completed");


		
		
	}
	printwriter.flush();
	}

}
