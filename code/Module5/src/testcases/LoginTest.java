package testcases;

import filereading.xls.ReadingXLSFile;
import reporting.DefaultReports;
//import reporting.htmlreports.BetterHTMLReports;
//import reporting.htmlreports.HTMLReports;
import reporting.htmlreports.*;
//import reporting.*;

public class LoginTest {

	public static void main(String arg[]){
		HTMLReports htmlRep = new HTMLReports();
		BetterHTMLReports betterRep = new BetterHTMLReports();
		DefaultReports dr = new DefaultReports();
		SendMailTest sendMail = new SendMailTest();
		
		
		//public - Any package
		ReadingXLSFile xls = new ReadingXLSFile();
		//System.out.println(xls.xlsLocation);
		
		/// private  - only be accessed within the class
		
		// default - only be accessed within the class and classes in same package
		
		//protected - only be accessed within the class,classes in same package and child classes in differt packages
		HTMLReports h=null;
		h.generate();
	}
}
