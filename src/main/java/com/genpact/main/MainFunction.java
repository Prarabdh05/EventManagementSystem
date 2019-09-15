package com.genpact.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.genpact.bean.Event;

public class MainFunction {
public static void main(String[] args) throws IOException, MyException {
	
	Scanner sc = new Scanner(System.in);
	System.out.println(" Press 1 to add the event");
	System.out.println(" Press 2 to retrieve the event");
	System.out.println(" Press 3 to exit");
	boolean b = true;
	int n;
	ManageEvent me  = new ManageEvent();
	while(b) {
	   n = sc.nextInt();
	   if(n==1) {
        me.StoreEvent();
	   }
	   else if(n==2) {
		   me.RetrieveEvent();
	   }
	   else if(n==3) {
		   b = false;
	   }
	}
}
}
