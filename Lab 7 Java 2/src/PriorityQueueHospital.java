import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType>
{

	/**
	 * PriorityQueue type list used for PriorityQueueHospital patients
	 */
	PriorityQueue<PatientType> priQueue = new PriorityQueue();
	
	/**
	 * Empty default constructor
	 */
	public PriorityQueueHospital()
	{
		
	}
	
	/**
	 * Adds patients to PriorityQueue using First in First out
	 */
	public void addPatient(PatientType patient)
	{
		priQueue.add(patient);
	}
	
	/**
	 * Only looks at the top of PriorityQueue list
	 * @return PatientType, patient at top of PriorityQueue
	 */
	public PatientType nextPatient()
	{
		return priQueue.peek();
	}
	
	/**
	 * Removes patient from PriorityQueue list
	 * @return PatientType, patient that is removed from PriorityQueue
	 */
	public PatientType treatNextPatient()
	{
		return priQueue.poll();
	}
	
	/**
	 * Amount of patients in PriorityQueue list
	 * @return int, Total number of patients remaining
	 */
	public int numPatients()
	{
		return priQueue.size();
	}
	
	/**
	 * Gives name of current class
	 * @return String, Name of class used
	 */
	public String hospitalType()
	{
		return "PriorityQueueHospital";
	}
	
	/**
	 * Information about all patients in PriorityQueue list
	 * @return String, All patient information in PriorityQueue list
	 */
	public String allPatientInfo()
	{
		return priQueue.toString();
	}
}
