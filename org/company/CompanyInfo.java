package org.company;

public class CompanyInfo {

	public void companyName(String name) {
		   System.out.println(name);
		}
		
	public static void main(String[] args) {
		CompanyInfo x = new CompanyInfo();
			x.companyName("Mitsuba");
			x.companyName("HCL");
			x.companyName("Infosys");
			x.companyName("Wipro");			
			
		}
	
}
