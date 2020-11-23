package com.student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String name;
		String fathername;
		int dob;
		int m[]=new int[3];
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		fathername=sc.next();
		dob=sc.nextInt();
		double avg;
		for(int i=0;i<3;i++)
		{
			m[i]=sc.nextInt();  
		}
		FileWriter fw=null;
		int total=0;
		
		try{
			fw=new FileWriter(name+".txt");
			PrintWriter pw=new PrintWriter(fw);
			for(int j=0;j<3;j++)
			{
			  total+=m[j];
			  
			}
			
			avg=(total/300)*100;
			pw.println(name);
			pw.println(fathername);
			pw.println(dob);
			pw.println(total);
			pw.println(avg);
			System.out.println("details entered");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			fw.close();
		}
	}

}
