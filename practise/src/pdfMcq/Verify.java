package pdfMcq;
import  java.lang.Math.*;
public class Verify {
	 public static void main(String[] args) {
		int a=55;
		int b=65;
		int c=50;		
		int res=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(res);
	    }
	}