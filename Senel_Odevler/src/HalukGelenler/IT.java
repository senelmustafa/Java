package HalukGelenler;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

import org.xml.sax.InputSource;

public class IT {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan IT alanini isteyerek
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		yazdiriniz
		 */
		
		System.out.print("Listeden bir bölüm seçiniz;\nqa ==> Quality Analyst \ndev ==> Developer \nba ==> Busines Analyst \npm ==> Project Manager \nYAZINIZ   :");
		Scanner scan=new Scanner(System.in);
		String meslek=scan.next();
		
		
		String qa="Qualty Analyst";
		String dev = "Developer";
		String ba = "Business Analyst";
		String pm = "Project Manager";
		
		if ( meslek.equalsIgnoreCase("qa")){
			System.out.println("Quality Analyst"  );
			
		
			}else if ( meslek.equalsIgnoreCase("dev")){
				System.out.println("Developer");
		
			}else if ( meslek.equalsIgnoreCase("ba")){
				System.out.println("Busines Analyst");
		
			}else if ( meslek.equalsIgnoreCase("pm")){
				System.out.println("Project Manager");
		
		
		} else {
			System.out.println("IT Bölümünü girmelisiniz");
		}scan.close();
	}

}
 
