import java.util.ArrayList;

public class StackHospital<PatientType>
{

	private ArrayList<PatientType> stackList;
	public StackHospital()
	{
		stackList = new ArrayList<PatientType>();
	}
	
	public void addPatient(PatientType patient)
	{
		stackList.add(patient);
	}
	
	public PatientType nextPatient()
	{
		
	}
	
	public PatientType treatNextPatient()
	{
		
	}
	
	public int numPatients()
	{
		
	}
	
	public String hospitalType()
	{
		
	}
	
	public String allPatientInfo()
	{
		
	}
}
