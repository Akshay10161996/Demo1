import java.io.File;
 
import java.io.IOException; 
import java.io.RandomAccessFile; 
import java.lang.NumberFormatException;
import java.util.Scanner; 
  
class FileRead extends CourseBank { 
	static String nameStudent;
	private Object ques;
  public static void main(String data[]) 
    { 
    	int flag=0;
    	System.out.println("Please Enter Your Name");
    	Scanner sc=new Scanner(System.in);
    	nameStudent=sc.next();
    	System.out.println("Press 1 for Java Quize\nPress 2 for C Quize\nPress 3 for C++ Quize");
    	CourseBank ques=new CourseBank();
    	FileRead fr=new FileRead();
    	do {
    	int opt=sc.nextInt();
    	switch(opt)
    	{
    	case 1:fr.QuestionGenerator("Java",nameStudent);
    		    flag=1;
    	       break;
    	case 2: fr.QuestionGenerator("C",nameStudent);
    			flag=1;
    		   break;
    	case 3:fr.QuestionGenerator("C++",nameStudent);
    			flag=1;
    	       break;
    	 default:System.out.println("Sorry wrong choice");
    	          System.out.println("ReEnter Your Course");
    	          flag=0;
    	
    	}
    	}while(flag==0);
    	 }
    }