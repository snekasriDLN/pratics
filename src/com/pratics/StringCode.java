package com.pratics;

//import java.util.Scanner;

public class StringCode {
	
		public static int getLetter(char letter) {
			return(int)letter-64;
		}
		public static int diffLetter(int a,int b) {
			int difference=a-b;
			if(difference<0)
				difference*=-1;
				return difference;
			}
		//public static Scanner scan;
		public static void main(String[] args) {
			//scan = new Scanner(System.in);
			System.out.println("Enter The Input String");
			//String input=scan.nextLine();
			String input="WORLD WIDE WEB";
			char ch1,ch2;
			int count,center,num1,num2,sum=0,output=0;
			String[] letters=input.toUpperCase().split("\\s");
			String total ="";
			for(String w:letters) 
			{
				count = 0;
				center=w.length()/2;
				sum=0;
				while (count<center)
				{
					ch1=w.charAt(count);
					ch2=w.charAt(w.length()-count-1);
					count++;
					num1=getLetter(ch1);
					num2=getLetter(ch2);
					sum+=diffLetter(num1,num2);
				}
				if(w.length()%2!=0)
				sum+=getLetter(w.charAt(center));
				total+=sum;
			}
			output=Integer.valueOf(total);
			System.out.println(output);		
			}		
	}