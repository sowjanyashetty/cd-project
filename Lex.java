package slr;
import java.util.Scanner;

import java.util.*;
import java.io.*;

public class Lex {
   static public boolean isKeyword(String buffer){
    	String keywords[] = {"int","else","proc","end","printf","if","then"};
    	int i;
    	boolean flag = false;
    	
    	for(i = 0; i < 7; ++i){
    		if(buffer.equals(keywords[i])){
    			flag = true;
    			break;
    		}
    	}
    	
    	return flag;
    }
	public static void main(String[] args)throws IOException {
		String op;
		int digit=0;
		String operators[] = {"+","-","*","%","=","&","&&"};
		int i;
        String lit="";
        File file=new File("input.txt");
        Scanner s=new Scanner(new File("input.txt"));
        FileInputStream fi=new FileInputStream(file);
        PrintWriter w=new PrintWriter("output.txt");
        if(!file.exists() )
        {
        	System.out.println("File does not exist :");
        	System.exit(0);
        }
        String ch;
        while(s.hasNext())
        {
        	ch=s.next();
        	for( i = 0; i < 7; ++i)
        	{
       		   if(ch.equals(operators[i])) //check if  token is operator
       		   {
       			   System.out.println(ch+" is operator");
                   w.println(ch);
       		    }
             }
       		if(isKeyword(ch))  //check if token is keyword
       		   {
       		     System.out.println(ch +" is keyword");
       		     w.println(ch);
       		    }
             if(ch.equals("(")||ch.equals(")")||ch.equals(";"))
             {
                 System.out.println(ch+" delimeter\n");
                  w.println(ch);
              }
                                            
             if(ch.equals("\"")) //check whether it is string literals
             {  
                	                 
                 ch=s.next();
                 while(!ch.equals("\""))
                 {
                                        	
                  	lit=lit+" "+ch;
                   	ch=s.next();
                                         
                  }
                  System.out.println("\""+lit+"\""+" is string literal");
                  w.println("st");
                  lit="";
              }
              if(Character.isDigit(ch.charAt(0))||Character.isAlphabetic(ch.charAt(0)))
                   {
                	   digit=0;
                     for(i=0;i<ch.length();i++)
                     {
                    	 if(Character.isDigit(ch.charAt(0))) 
                    	 {
                    		 digit=1;
                    	     if(!(Character.isDigit(ch.charAt(i))))
                    	    	 {
                    	    	    System.out.println(ch+"invalid token");
                    	    	    break;
                    	    	 }
                    	     }
                     }
                     if(i==ch.length()&&digit==1) //Digit    
                     {
                    	 System.out.println(Integer.parseInt(ch)+" is digit");
                    	 w.println("d1");
                     }
                     if(digit==0 && !(isKeyword(ch)))
                     {
                    	 
                       System.out.println(ch+" is identifier");
                       w.println(ch);
                     }
                     
                   }
                   
                                      
                   
       		
       		
    	}
    	
    	
    	s.close(); 
    	w.close();
        }
        
        

	}


