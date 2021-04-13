package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HmsComponents extends BaseClass{
	
	Hms_OR_PermReg orp = new Hms_OR_PermReg();
	Hms_OR_Admission ora = new Hms_OR_Admission();
	Hms_OR_AdmissionAdvie oraa = new Hms_OR_AdmissionAdvie();
	Hms_OR_SearchReg ors = new Hms_OR_SearchReg();
  
  public void launchURL()
  {
	  openBrowser();
	  openURL("http://selenium4testing.com/hms/");
  }
  
  public void login() 
  {
	  enterText(By.name("username"), "admin");
	  enterText(By.name("password"), "admin");
	  click(By.name("submit"));
  }
  
  public void navigateToPermReg() 
  {
	  click(By.linkText("Registration"));
  }
  
  public void navigateToEmergencyReg() 
  {
	  click(By.linkText("Registration"));
	  click(By.linkText("Emergency Registration"));
  }
  
  public void navigateToAdmission() 
  {
	  click(By.linkText("ADT"));
  }
  
  public void navigateToAdmissionAdvise() 
  {
	  click(By.linkText("ADT"));
	  click(By.linkText("Admission Advice"));
  }
  
  public void navigateToSearchReg() 
  {
	  click(By.linkText("Registration"));
	  click(By.linkText("Search Registration"));
  }
  
  public void calendarDOB(String month, String day) 
  {
	  while(true)
	  {
		  String curr_month = driver.findElement(By.xpath("//*[@id='tcalControls']/tbody/tr/th")).getText();
		  
		  if(curr_month.equals(month))
		  {
			  break;
		  }
		  else
		  {
			  click(By.xpath("//*[@id='tcalPrevMonth']"));
		  }
	  }
	  
	  List<WebElement> alldates = driver.findElements(By.xpath("//*[@id='tcalGrid']/tbody/tr/td"));
	  
	  for(WebElement e:alldates)
	  {
		  String curr_day = e.getText();
		  if(curr_day.equals(day))
		  {
			  e.click();
			  break;
		  }
	  }
  }
  
  public void calendarFrwd(String month, String day) 
  {
	  while(true)
	  {
		  String curr_month = driver.findElement(By.xpath("//*[@id='tcalControls']/tbody/tr/th")).getText();
		  
		  if(curr_month.equals(month))
		  {
			  break;
		  }
		  else
		  {
			  click(By.xpath("//*[@id='tcalNextMonth']"));
		  }
	  }
	  
	  List<WebElement> alldates = driver.findElements(By.xpath("//*[@id='tcalGrid']/tbody/tr/td"));
	  
	  for(WebElement e:alldates)
	  {
		  String curr_day = e.getText();
		  if(curr_day.equals(day))
		  {
			  e.click();
			  break;
		  }
	  }
  }
  
  
  public void permanentReg() 
  {
	  selectByVisible(orp.patientCat, "Staff");
	  selectByVisible(orp.relation, "Brother");
	  selectByVisible(orp.title, "Mr.");
		
	  enterText(orp.motherName, "Pratyusha K");
	  enterText(orp.patientname, "Amar");
	  selectByVisible(orp.patientIdentity, "PAN Card");
		
	  enterText(orp.middleName, "Akbar");
	  enterText(orp.patientIdProof, "BAT1234567");
	  enterText(orp.lastName, "Antony");
	  
	//DOB
	  click(orp.dob);
	  calendarDOB("March 2016", "20");
	  
	  selectByVisible(orp.nationality, "Indian");
	  enterText(orp.age, "28");
		
	  selectByVisible(orp.vip, "No");
	  selectByVisible(orp.gender, "Male");
	  selectByVisible(orp.education, "MCA");
	  selectByVisible(orp.maritalStatus, "Single");
	  selectByVisible(orp.occupation, "Employee");
	  selectByVisible(orp.religion, "Hindu");
	  selectByVisible(orp.bloodGrp, "B+");
	  selectByVisible(orp.primaryLanguage, "Telugu");
	  selectByVisible(orp.citizenship, "Indian");
	  selectByVisible(orp.seniorCitizen, "No");
		
	  enterText(orp.address1, "Prashasan Nagar");
	  enterText(orp.address2, "Hyderabad");
	  enterText(orp.mobile, "9966996699");
	  enterText(orp.email, "whocares@gmail.com");
	  enterText(orp.zip, "500085");
		
	  selectByVisible(orp.countryCode, "India");
	  
	//upload Image
	  
	  enterText(orp.image, "D:\\gmail.png");
	  click(orp.submit);
	  
	  System.out.println(alertGetText());
	  alertAccept();
	  
	  quit();
  }
  
  public void admission() 
  {
	  enterText(ora.patientId, "123456");
	  enterText(ora.mrNum, "PR1912462766");
	  enterText(ora.patientName, "Amar");
	  enterText(ora.reqNum, "123456");
	  
	  //Admission Details
	  selectByVisible(ora.admissionType, "Accident");
	  click(ora.admissionDate);
	  calendarFrwd("June 2020", "20");
	  selectByVisible(ora.patientClass, "1st Class");
	  enterText(ora.expectedLos, "2");
	  selectByVisible(ora.expectedLosFormat, "Days");
	  selectByVisible(ora.insurancePlan, "Yes");
	  click(ora.expectedDischarge);
	  calendarFrwd("August 2020", "20");
	  selectByVisible(ora.admissionSource, "1st Class");
	  selectByVisible(ora.HospitalService, "Consultation");
	  selectByVisible(ora.docName, "Sai");
	  selectByVisible(ora.hospitalSubService, "Consultation");
	  selectByVisible(ora.docSpeciality, "cordialagist");
	  
	  enterText(ora.provDiagnosis, "yet to test");
	  enterText(ora.primaryConsultant, "Ramana");
	  enterText(ora.chiefComp, "yet to test");
	  selectByVisible(ora.speciality, "cordialagist");
	  enterText(ora.notes, "this is just an input .. this is just an input");
	  selectByVisible(ora.multipleDoc, "Sai");
	  selectByVisible(ora.scProof, "No");
	  
	  //Episode Details
	  enterText(ora.episodenum, "123456");
	  enterText(ora.encounterNum, "123456");
	  enterText(ora.episodeDesc, "this is just an input");
	  
	  //Assign Bed
	  selectByVisible(ora.bedClass, "A/C");
	  selectByVisible(ora.admittedBedClass, "A/C");
	  selectByVisible(ora.bedNum, "BED-2");
	  selectByVisible(ora.nursingStation, "Rani");
	  selectByVisible(ora.wardNum, "9");
	  
	  //Additional Detials
	  selectByVisible(ora.ambulatoryStatus, "Walking");
	  selectByVisible(ora.modeArrival, "Walking");
	  
	  //Patient Valubles
	  enterText(ora.patientValuables, "this is just an input .. this is just an input");
	  selectByVisible(ora.capturedBy, "Doctor");
	  click(ora.capturedDate);
	  calendarFrwd("March 2020", "25");
	  
	  //Submit
	  click(ora.submit);
	  
	  System.out.println(alertGetText());
	  alertAccept();
	  
	  quit();
	  	  
  }
  
  public void admissionAdvise() throws Exception 
  {
	  FileInputStream fi = new FileInputStream(".\\Test data\\AdmissionAdviceData.xlsx");
	  Workbook w = new XSSFWorkbook(fi);
	  Sheet s = w.getSheet("Sheet1");
	  for (int i = 1; i <= s.getLastRowNum(); i++) 
	  {
		  Row r = s.getRow(i);
		  
		   Cell patientMrnum  = r.getCell(0);
		   Cell patientName   = r.getCell(1);
		   Cell gender        = r.getCell(2);
		   Cell docName       = r.getCell(3);                                  
		   Cell speciality    = r.getCell(4);
		   Cell admissionType = r.getCell(5);
		   Cell patientCat    = r.getCell(6);
		   Cell hospitalServ  = r.getCell(7);
		   Cell provDiagnosys = r.getCell(8);
		   Cell expDate1      = r.getCell(9);                            
		   Cell expDate2      = r.getCell(10); 
		   Cell expLos 		  = r.getCell(11);
		   Cell expFormat     = r.getCell(12);
		   Cell bedReq 		  = r.getCell(13);
		   Cell remarks 	  = r.getCell(14);
		   
		   enterText(oraa.patientMrnum, patientMrnum.toString());
		   enterText(oraa.patientName, patientName.toString());
		   selectByVisible(oraa.gender, gender.toString());
		   selectByVisible(oraa.docName, docName.toString());
		   selectByVisible(oraa.speciality, speciality.toString());
		   selectByVisible(oraa.admissionType, admissionType.toString());
		   selectByVisible(oraa.patientCat, patientCat.toString());
		   selectByVisible(oraa.hospitalServ, hospitalServ.toString());
		   enterText(oraa.provDiagnosys, provDiagnosys.toString());
		   click(oraa.expDate);
		   calendarFrwd(expDate1.toString(),expDate2.toString());
		   enterText(oraa.expLos,expLos.toString());
		   selectByVisible(oraa.expFormat, expFormat.toString());
		   selectByVisible(oraa.bedReq, bedReq.toString());
		   enterText(oraa.remarks, remarks.toString());
		   click(oraa.submit);
			  
		   System.out.println(alertGetText());
		   alertAccept();
		   navigateToAdmissionAdvise();
		   w.close();
		
	}
	  
	  
	  //Admission Advice
	  
	/*  enterText(oraa.patientMrnum, "PR1912462766");
	  enterText(oraa.patientName, "Amar");
	  selectByVisible(oraa.gender, "Male");
	  selectByVisible(oraa.docName, "sharath");
	  selectByVisible(oraa.speciality, "Cordialagist");
	  selectByVisible(oraa.admissionType, "Emergency");
	  selectByVisible(oraa.patientCat, "Staff");
	  selectByVisible(oraa.hospitalServ, "Consultation");
	  enterText(oraa.provDiagnosys, "Yet to be tested");
	  click(oraa.expDate);
	  calendarFrwd("August 2020", "25");
	  enterText(oraa.expLos, "2");
	  selectByVisible(oraa.expFormat, "Days");
	  selectByVisible(oraa.bedReq, "Yes");
	  enterText(oraa.remarks, "this is just an input.. this is just an input");
	  click(oraa.submit);
	  
	  System.out.println(alertGetText());
	  alertAccept(); */
	  
	  quit();  
  }
  
  public void emergencyReg() 
  {
	  selectByVisible(orp.patientCat, "Staff");
	  selectByVisible(orp.relation, "Brother");
	  selectByVisible(orp.title, "Mr.");
		
	  enterText(orp.motherName, "Pratyusha K");
	  enterText(orp.patientname, "Amar");
	  selectByVisible(orp.patientIdentity, "PAN Card");
		
	  enterText(orp.middleName, "Akbar");
	  enterText(orp.patientIdProof, "BAT1234567");
	  enterText(orp.lastName, "Antony");
	  
	//DOB
	  click(orp.dob);
	  calendarDOB("March 2016", "20");
	  
	  selectByVisible(orp.nationality, "Indian");
	  enterText(orp.age, "28");
		
	  selectByVisible(orp.vip, "No");
	  selectByVisible(orp.gender, "Male");
	  selectByVisible(orp.education, "MCA");
	  selectByVisible(orp.maritalStatus, "Single");
	  selectByVisible(orp.occupation, "Employee");
	  selectByVisible(orp.religion, "Hindu");
	  selectByVisible(orp.bloodGrp, "B+");
	  selectByVisible(orp.primaryLanguage, "Telugu");
	  selectByVisible(orp.citizenship, "Indian");
	  selectByVisible(orp.seniorCitizen, "No");
		
	  enterText(orp.address1, "Prashasan Nagar");
	  enterText(orp.address2, "Hyderabad");
	  enterText(orp.mobile, "9966996699");
	  enterText(orp.email, "whocares@gmail.com");
	  enterText(orp.zip, "500085");
		
	  selectByVisible(orp.countryCode, "India");
	  
	//upload Image
	  
	  enterText(orp.image, "D:\\gmail.png");
	  click(orp.submit);
	  
	  System.out.println(alertGetText());
	  alertAccept();
	  
	  quit();
  }
  
  
  public void searchRegistration(String str) throws IOException 
  {
	  //Enter MR_No OR FirstName OR Email ID
	  enterText(ors.searchKeyword, str);
	  
	  click(ors.searchButton);
	  takeScreenShot("SearchReg");
	  quit();
  }
  
  
}




