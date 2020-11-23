package com.character;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriterex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FileWriter fw=null;
        try {
			fw=new FileWriter("fw.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			fw.write("this is an example");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("written");
       
     
        try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        		
	}
	
    
}
