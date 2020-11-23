package com.character;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Piped {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       final PipedWriter pw=new PipedWriter();
       final PipedReader pr=new PipedReader();
       
       pr.connect(pw);
       
       
       Thread t1=new Thread()
       {
    	   public void run()
    	   {
    		   try {
				pw.write("piped reader and writer");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   }
       };
       
       Thread t2=new Thread()
       {
    	   public void run()
    	   {
    		   try {
				int i;
				while((i=pr.read())!=-1)
				{
					System.out.print((char)i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	   }
       };
    	   
       t1.start();
       t2.start();
     
	}

}
