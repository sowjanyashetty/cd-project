package slr;
import java.util.*;


import java.io.*;
import java.util.Stack;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;



import java.awt.event.*;


 public class Slr {
   public static Object prow[][]=new Object[100][3] ;
	public static int axn[][][]={ 

            {{-1,-1},{-1,-1},{100,3},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,4},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,19}},
            {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{102,102}},
	      {{100,5},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{100,6},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{101,3},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,3},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{100,7},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,8},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{100,3},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,4},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,19}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,4},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,11},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,12},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,15},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,16},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,7},{-1,-1},{-1,-1},{101,7},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,19},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{100,20},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,4},{-1,-1},{-1,-1},{100,23},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,24},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,17},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,2}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,6},{-1,-1},{-1,-1},{101,6},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,25},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,28},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{100,31},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{100,32},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,33},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,10},{-1,-1},{-1,-1},{101,10},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,35},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,23},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,38},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,39},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,40},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,19},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,5},{-1,-1},{-1,-1},{101,5},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,8},{-1,-1},{-1,-1},{101,8},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,11},{-1,-1},{-1,-1},{101,11},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,38},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,42},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,12},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,43},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,38},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,46},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,47},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,48},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,49},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,9},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,9},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,14},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,19},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,15},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,13},{-1,-1},{-1,-1},{101,13},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,51},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{100,52},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{100,53},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,16},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}},
	      {{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,18},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{101,18},{-1,-1},{-1,-1},{-1,-1},{-1,-1},{-1,-1}}
	    };//Axn Table

public static int gotot[][]={
{-1,1,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},

{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,9,2,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,10,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},

{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,13,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,17,-1,-1,-1,-1,-1,-1,-1,-1,-1},

{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,18,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,21,22,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},

{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,27,26,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,29,30,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},

{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,34,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,37,-1,-1,-1,-1,-1,-1,36},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},

{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,41,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},

{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,36},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,44},

{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},

{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,50,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},

{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1}
            };  //GoTo table 

public static void main(String args[])throws IOException
{
	A a1=new A();
	
	Stack<String> b=new Stack<String>();
	ArrayList<String> inp=new ArrayList<String>();
	ArrayList<String> disp=new ArrayList<String>();

	Scanner s=new Scanner(new File("output.txt")); //input from lex
	while(s.hasNextLine()) {
		String str=s.nextLine();
		inp.add(str);
		disp.add(str);
		}
	inp.add("$");
	disp.add("$");
	String GM[][]= {
			{"P'","P","1"},
			{"P","K x ; P","4"},
			{"P","proc foo ( K b ) s end foo ","9"},
			{"K","int","1"},
			{"S","D I","2"},
			{"D","b R d1 ;","4"},
			{"I","I I'","2"},
			{"I"," ","0"},
			{"I'","B1 end if","3"},
			{"B1","if C then S1","4"},
			{"I'","B1 C2","2"},
			{"I'","B1 B C2","3"},
			{"B","else B1","2"},
			{"C2","else S1 end if","4"},
			{"C","E1 && E2","3"},
			{"E1","x R d1","3"},
			{"E2","b R d1","3"},
			{"R","=","1"},
			{"S1","printf ( st ) ;","5"},
			{"P"," ","0"}
			
			
			
	};
	int p=0;
	int r=0;
	int ic;
    System.out.println("Entered input is :\n");
    for(int i=0;i<inp.size();i++)
    	System.out.print(inp.get(i)+" ");
    System.out.println("\n\n");
    b.push("0");
    System.out.println("Stack\t\t\t\t\t\t\tInput\t\t\t\t\t\t\t \t\t\t\tProduction");
	System.out.println("\n\n");
	System.out.print(b+"\t\t\t\t\t\t\t\t");
	prow[p][0]= b.toString();
	
	
	for(int j=0;j<disp.size();j++)
		System.out.print(disp.get(j)+" ");
	for(int pos=(disp.size()/8);pos<10;pos++)
 	   System.out.print("\t");
	prow[p][1]=disp.toString();
	int i=0;
    for(;;)
    {
    	String token=inp.get(i);
    	if(token.contentEquals("x")) ic=0;

    	 else if(token.contentEquals(";")) ic=1;

    	 else if(token.contentEquals("proc")) ic=2;

    	 else if(token.contentEquals("foo")) ic=3;

    	 else if(token.contentEquals("(")) ic=4;

    	 else if(token.contentEquals("b")) ic=5;
    	 else if(token.contentEquals(")")) ic=6;
    	 else if(token.contentEquals("end")) ic=7;
    	 else if(token.contentEquals("int")) ic=8;
    	 else if(token.contentEquals("d1")) ic=9;
    	 else if(token.contentEquals("if")) ic=10;
    	 else if(token.contentEquals("then")) ic=11;
    	 else if(token.contentEquals("else")) ic=12;
    	 else if(token.contentEquals("&&")) ic=13;
    	 else if(token.contentEquals("=")) ic=14;
    	 else if(token.contentEquals("printf")) ic=15;
    	 else if(token.contentEquals("st")) ic=16;
    	 else if(token.contentEquals("$")) ic=17;

    	 else {

    	    System.out.println("Error!!");

    	    break;

    	 }
    	int st=Integer.parseInt(b.peek());
    	
    	 if(axn[st][ic][0]==100)   // shift

    	    {
             
    	      b.push(token);

    	      int shift=(axn[st][ic][1]);
              b.push((Integer.toString(shift))); //push shift value to stack
              disp.remove(token);   //remove the token from the input
              i++;
              System.out.println("shift"+shift);
             prow[p][2]= "shift"+Integer.toString(shift);
              p++;
    	     System.out.println("\n");
    	     System.out.print(b);//writes to the console
    	     prow[p][0]=b.toString();//stored in array which is parameter for jtable
    	     for(int pos=(b.size()/8);pos<8;pos++)
   	    	  System.out.print("\t");
    	     for(int j=0;j<disp.size();j++)
    	    		System.out.print(disp.get(j)+" ");
    	     prow[p][1]=disp.toString();
    	     for(int pos=(disp.size()/8);pos<10;pos++)
    	   	   System.out.print("\t");
    	     

    	    }

    	 else if(axn[st][ic][0]==101) //reduce

    	    {
               int n=axn[st][ic][1];
               int g;
    	       int len= Integer.parseInt(GM[n][2]);
    	       for(int k=0;k<(2*len);k++)
                      b.pop();      //pop=2*length
    	      String src=GM[n][0];
    	      String prod=GM[n][1];
    	      int Tp=Integer.parseInt(b.peek());
    	      switch(src)
    	      {
    	      case "P'":g=0;
    	                 break;
    	      case "P":g=1;
              break;
    	      case "K":g=2;
              break;
    	      case "S":g=3;
              break;
    	      case "D":g=4;
              break;
    	      case "I":g=5;
              break;
    	      case "I'":g=6;
              break;
    	      case "B1":g=7;
              break;
    	      case "B":g=8;
              break;
    	      case "C2":g=9;
              break;
    	      case "C":g=10;
              break;
    	      case "E1":g=11;
              break;
    	      case "E2":g=12;
              break;
    	      case "R":g=13;
              break;
    	      case "S1":g=14;
              break;
              default:g='\0';
                   break;
    	      }
             int action=gotot[Tp][g];     //goto(src,top_of_the_stack)
    	     b.push(src);
    	     b.push(Integer.toString(action));
    	     System.out.println(src+"--->"+prod);
    	     prow[p][2]=src+"--->"+prod;
    	     p++;
    	     System.out.println("\n");
    	     System.out.print(b);
    	     prow[p][0]=b.toString();
    	     for(int pos=(b.size()/8);pos<8;pos++)
    	    	  System.out.print("\t");
    	     for(int j=0;j<disp.size();j++)
    	    		System.out.print(disp.get(j)+" ");
    	     prow[p][1]=disp.toString();
    	     for(int pos=(disp.size()/8);pos<10;pos++)
    	    	   System.out.print("\t");
    	     

    	    }

    	 else if(axn[st][ic][1]==102)   //Accept state

    	    {

    	   System.out.println("\nGiven String is accepted \n");
    	    prow[p][2]="acc";
    	      break;
    	      

    	    }

    	   else

    	   {

    	  System.out.println("Given String is rejected \n");

    	      break;

    	    }
    }
	
}
}
class A extends Slr
{
	

           

	A()
	{
		JFrame f=new JFrame("Parser Table");
		f.setSize(1200,1000);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String col[]= {"state","x",";","proc","foo","(","b",")","end","int","d1","if","then","else","&&","=","printf","st","$",
				        "P'","P","K","S","D","I","I'","B1","B","C2","C","E1","E2","R","S1"
	};
		String col1[]= {"stack","Input","production"};
		Object row[][]=new Object[54][34];
		for(int i=0;i<54;i++) {
			row[i][0]=Integer.toString(i);
			for(int j=1;j<19;j++)
			{
				if(axn[i][j-1][0]==100) {
					String in="s";
					String n=Integer.toString(axn[i][j-1][1]);
					row[i][j]=in+n;
				       }
				else if (axn[i][j-1][0]==101)
				{
					String in="r";
					String n=Integer.toString(axn[i][j-1][1]);
					row[i][j]=in+n;
				}
				else if(axn[i][j-1][0]==102) 
				{
					row[i][j]="acc";
				}
			}
			for(int j=19;j<=33;j++) {
				if(gotot[i][j-19]!=-1)
				    row[i][j]=Integer.toString(gotot[i][j-19]);
			}
		}
		    
			JTable jt=new JTable(row,col);//parsing table
			TableColumn cols=jt.getColumnModel().getColumn(3);
			cols.setPreferredWidth(200);
			JScrollPane jp=new JScrollPane(jt);
			jp.setPreferredSize(new Dimension(900,650));
			
			f.add(jp);
			f.setVisible(true);
			JFrame f1=new JFrame("Parser Table");//second frame
			f1.setSize(1800,1000);
			f1.setLayout(new FlowLayout());
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JTable jt1=new JTable(prow,col1);//parsing string table
			TableColumn cols1=jt.getColumnModel().getColumn(0);
			cols1.setPreferredWidth(800);
			TableColumn cols2=jt.getColumnModel().getColumn(1);
			cols2.setPreferredWidth(800);
			
			JScrollPane jp1=new JScrollPane(jt1);
			
			jp1.setPreferredSize(new Dimension(1000,600));
			
			f1.add(jp1);
			f1.setVisible(true);
			

			
				
			
			
		}
		
			
		
}
	
			

