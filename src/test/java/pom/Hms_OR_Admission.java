package pom;

import org.openqa.selenium.By;

public class Hms_OR_Admission
{
	public By patientId = By.name("PNT_ID");                                            
    public By mrNum  = By.name("MR_NO");                                            
    public By patientName = By.name("BOOKING_ID");                                            
    public By reqNum = By.name("REQ_ID"); 
                                        
  //Admission Details
    public By admissionType = By.name("ADM_TPYE");                                            
    public By admissionDate = By.name("EXP_DATE");
  
    public By patientClass = By.name("PNT_CLASS");                                           
    public By expectedLos = By.name("EXP_STAY_DATE");                                            
    public By expectedLosFormat = By.name("EXP_STAY_FORMAT");                                            
    public By insurancePlan = By.name("INSU_PLAN");                                            
    public By expectedDischarge = By.name("EXP_DISCHARGE_DATE");
  
    public By admissionSource = By.name("ADM_SOURSE");                                            
    public By HospitalService = By.name("HOSPITAL_SERVICES");                                            
    public By docName = By.name("DOC_NAME");                                            
    public By hospitalSubService = By.name("HOSPITAL_SUB_SERVICES");                                            
    public By docSpeciality = By.name("DOC_SPL");                                            
  
    public By provDiagnosis = By.name("PROVI_DIAGNOS");                                            
    public By primaryConsultant = By.name("PRMRY_CONSULT");                                            
    public By chiefComp = By.name("CHIEF_COMPLAINT");                                            
    public By speciality = By.name("ADD_DOC_SPL");                                            
    public By notes = By.name("NOTES");                                            
    public By multipleDoc = By.name("ADD_DOC_NAME");                                            
    public By scProof = By.name("SC_PROOF");                                            
  
  //Episode Details
    public By episodenum = By.name("EPISODE_NO");                                            
    public By encounterNum = By.name("ENCOUNTER_NO");                                            
    public By episodeDesc = By.name("EPISODE_DEC");                                            
  
  //Assign Bed
    public By bedClass = By.name("BED_CLASS");                                            
    public By admittedBedClass = By.name("ADM_BED_CLASS");                                            
    public By bedNum = By.name("BED_NUM");                                            
    public By nursingStation = By.name("NURSING_STATION");                                            
    public By wardNum = By.name("WARD_NUM");                                           
  
  //Additional Detials
    public By ambulatoryStatus = By.name("AMBULATORY_STATUS");                                            
    public By modeArrival = By.name("MODE_ARRIVAL");                                            
  
  //Patient Valubles
    public By patientValuables = By.name("PNT_VALUBLES");                                            
    public By capturedBy = By.name("CAPTURED_BY");                                            
    public By capturedDate = By.name("CAPTURED_DATE");
  
  
  //Submit
    public By submit = By.name("submit");

}
