package com.character;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Inputstreamreader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    InputStreamReader isr=null;
    try {
		isr=new InputStreamReader(null, "a.txt");
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	}

}
