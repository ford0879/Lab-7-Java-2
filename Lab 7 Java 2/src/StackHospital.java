import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType>
{

	/**
	 * Stack type list used for StackHospital patients
	 */
	Stack<PatientType> stack = new Stack<PatientType>();
	
	/**
	 * Empty default constructor
	 */
	public StackHospital()
	{
		
	}
	
	/**
	 * Adds patients to stack using Last in First out
	 */
	public void addPatient(PatientType patient)
	{
		stack.push(patient);
	}
	
	/**
	 * Only looks at the top of stack list
	 * @return PatientType, patient at top of stack
	 */
	public PatientType nextPatient()
	{
		return stack.peek();
	}
	
	/**
	 * Removes patient from stack list
	 * @return PatientType, patient that is removed from stack
	 */
	public PatientType treatNextPatient()
	{
		return stack.pop();
	}
	
	/**
	 * Amount of patients in stack list
	 * @return int, Total number of patients remaining
	 */
	public int numPatients()
	{
		return stack.size();
	}
	
	/**
	 * Gives name of current class
	 * @return String, Name of class used
	 */
	public String hospitalType()
	{
		return "StackHospital";
	}
	
	/**
	 * Information about all patients in stack list
	 * @return String, All patient information in stack list
	 */
	public String allPatientInfo()
	{
		return stack.toString();
	}
}
