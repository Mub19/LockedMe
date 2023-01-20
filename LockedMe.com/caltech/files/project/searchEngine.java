package com.LockedMe.caltech.files.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class searchEngine 
{
public static void main(String[] args) throws IOException 
{
	//**** FILE DICTIONARY CREATION  ****
	
	try (Scanner sc = new Scanner(System.in)) {
		int choice;
		boolean running = true;
		String path = "/Users/palliyathmubashir/Desktop/";
		File folder = new File(path);
		File[] filesList = folder.listFiles();    
		while (running) 
			{
		    System.out.println("!*************************************************!");
		    System.out.println("       WELCOME TO COMPANY LOCKERS PVT LTD");
		    System.out.println("!*************************************************!");
		    System.out.println("1. SHOW ALL FILES IN ASCENDING ORDER");
		    System.out.println("");
		    System.out.println("2. SELECT SUBMENU");
		    System.out.println("");
		    System.out.println("3. EXIT PROGRAM");
		    System.out.println("!**************************************************!");
		    System.out.println(" ###             SELECT YOUR OPERATION          ###");
		    System.out.println("!**************************************************!");
		    System.out.println("");
		    System.out.print("ENTER A NUMBER = ");
		    
		    // **** FILES IN ASCENDING ORDER ****
		    
		    choice = sc.nextInt();
		    switch (choice) {
		        case 1:
		            Arrays.sort(filesList);
		            for (File file : filesList) 
		            {
		                System.out.println(file.getName());
		            }
		            	System.out.println("");
		            	System.out.println("THANK YOU FOR USING OUR SEARCH ENGINE *****! SEARCH AGAIN ****!");
		            	System.out.println("");
		            break;
		        case 2:
		            boolean subRunning = true;
		            while (subRunning)
		            {
		            	System.out.println("");
		            	System.out.println("!**************************************************!");
		                System.out.println(" ###             SELECT YOUR OPTION             ###");
		                System.out.println("!**************************************************!");
		                System.out.println("1. CREATE A FILE ");
		                System.out.println("");
		                System.out.println("2. DELETE A FILE ");
		                System.out.println("");
		                System.out.println("3. SEARCH FOR A FILE");
		                System.out.println("");
		                System.out.println("4. EXIT SUBMENU");
		                System.out.println("");
		                System.out.print("ENTER A NUMBER = ");
		                int subChoice = sc.nextInt();
		                switch (subChoice) 
		                {
		                    case 1:
		                    	
		                    	//**** FILE CREATION  ****
		                    	
		                    	System.out.println("");
		                        System.out.print("ENTER THE FILE NAME :");
		                        String filename = sc.next();
		                        String finalpath = path + filename;
		                        File file = new File(finalpath);
		                        System.out.println("");
		                        System.out.println(finalpath.toUpperCase());
		                        boolean res = file.createNewFile();
		                        if (res != true) 
		                        {
		                            System.out.println("");
		                            System.out.println("FILE COULD NOT BE CREATED.");
		                        } else 
		                        {
		                        	System.out.println("");
		                            System.out.println("FILE CREATED SUCCESSFULLY.");
		                        }
		                        	System.out.println("");
		                        	System.out.println("THANK YOU FOR USING OUR SEARCH ENGINE *****! SEARCH AGAIN ****!");
		                        	System.out.println("");
		                        break;
		                    case 2:
		                    	
		                    	// **** DELETE A FILE ****
		                    	
		                    	System.out.println("");
		                        System.out.print("ENTER THE FILE NAME :");
		                        filename = sc.next();
		                        finalpath = path + filename;
		                        System.out.println("");
		                        System.out.println(finalpath.toUpperCase());
		                        file = new File(finalpath);
		                        if (!file.exists()) 
		                        {
		                        	System.out.println("");
		                            System.out.println("FILE DOES NOT EXIST.");
		                        } else 
		                        {
		                            file.delete();
		                            System.out.println("");
		                            System.out.println("FILE DELETED SUCCESSFULLY.");
		                        }
		                        	System.out.println("");
		                        	System.out.println("THANK YOU FOR USING OUR SEARCH ENGINE *****! SEARCH AGAIN ****!");
		                        	System.out.println("");
		                        break;
		                    case 3:
		                    	
		                    	//**** SEARCH THE FILES ****
		                    	
		                    	
		                    	System.out.println("");
		                        System.out.print("ENTER THE FILE NAME :");
		                        String filenamesearch = sc.next();
		                        String finalpath1 = path + filenamesearch;
		                        //File file = new File(finalpath1);
		                        System.out.println("");
		                        System.out.println(finalpath1.toUpperCase());
		                        boolean found = false;
		                        for (File f : filesList)
		                        {
		                            if (f.getName().equals(filenamesearch)) 
		                            {
		                            	System.out.println("");
		                                System.out.println("FILE FOUND!");
		                                found = true;
		                                break;
		                            }
		                        }
		                        if (!found) 
		                        {
		                        	System.out.println("");
		                            System.out.println("FILE NOT FOUND.");
		                        }
		                        	System.out.println("");
		                        	System.out.println("THANK YOU FOR USING OUR SEARCH ENGINE *****! SEARCH AGAIN ****!");
		                        	System.out.println("");
		                        break;
		                    case 4:
		                        subRunning = false;
		                        System.out.println("");
		                    	System.out.println("THANK YOU FOR USING OUR SEARCH ENGINE *****! SEARCH AGAIN ****!");
		                    	System.out.println("");
		                        break;
		                }
		            }
		            break;
		        case 3:
		            running = false;
		            System.out.println("");
		        	System.out.println("THANK YOU FOR USING OUR SEARCH ENGINE *****! SEARCH AGAIN ****!");
		        	System.out.println("");
		            break;
		    }
		}
	}
}
}
