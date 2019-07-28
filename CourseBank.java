import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public  class CourseBank {
	public void QuestionGenerator(String course,String namestudent)
	{
		{
			try {
			String nameNumberString; 
	        String name,option;  
	        int index,points=0,i=0; 
	       
	        String cou=course+".txt";// Using file pointer creating the file.
	        File file = new File(cou); 

	        if (!file.exists()) { 
	             file.createNewFile(); // Create a new file if not exists.
	        }  
	        
	        RandomAccessFile raf 
	            = new RandomAccessFile(file, "r"); // Opening file in reading and write mode.
	        boolean found = false; 
	         
	        // Traversing the file 
	        // getFilePointer() give the current offset 
	        // value from start of the file. 
	        while (raf.getFilePointer() < raf.length())  // Traversing the file 
	        										// getFilePointer() give the current offset                        
	            										// value from start of the file. 
	        {  											// reading line from the file.
	        	
	            
	            nameNumberString = raf.readLine(); 

	            // finding the position of '?' 
	            index = nameNumberString.indexOf('?'); 

	            // separating name and number. 
	            name = nameNumberString 
	                       .substring(0, index); 
	            option
	                =        nameNumberString 
	                              .substring(index + 1); 

	            // Print the contact data
	            
	            System.out.println("Que"+
	                                name + "\n"
	                               + "Options: "
	                               + option + "\n"); 
	            Scanner sc=new Scanner(System.in);
	            String ans=sc.next();
	            Answer a=new Answer();
	            if(course.equals("Java"))
	            {
	            if(ans.equalsIgnoreCase(a.java[i++]))
	            	{
	            		points++;
	            	}
	            }
	            else if(course.equals("C"))
	            {
	            	if(ans.equalsIgnoreCase(a.C[i++]))
	            	{
	            		points++;
	            	}	
	            }
	            else
	            {
	            	if(ans.equalsIgnoreCase(a.C1[i++]))
	            	{
	            		points++;
	            	}
	            }
	            }
	        System.out.println("Score obtained for Student "+ namestudent + " for Course "+course+" is "+points);
	    }

	        catch (IOException ioe) 
	        { 

	            System.out.println(ioe); 
	        } 
	        catch (NumberFormatException nef) 
	        { 

	            System.out.println(nef); 
	        } 
	    } 

	}
	

}
