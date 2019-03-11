import java.util.PriorityQueue;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType>
{

	/**
	 * Queue type list used for QueueHospital patients
	 */
	Queue<PatientType> queue = new PriorityQueue<PatientType>();
	
	/**
	 * Empty default constructor
	 */
	public QueueHospital()
	{
		
	}
	
	/**
	 * Adds patients to Queue using First in First out
	 */
	public void addPatient(PatientType patient)
	{
		queue.add(patient);
	}
	
	/**
	 * Only looks at the top of Queue list
	 * @return PatientType, patient at top of Queue
	 */
	public PatientType nextPatient()
	{
		return queue.peek();
	}
	
	/**
	 * Removes patient from Queue list
	 * @return PatientType, patient that is removed from Queue
	 */
	public PatientType treatNextPatient()
	{
		return queue.poll();
	}
	
	/**
	 * Amount of patients in Queue list
	 * @return int, Total number of patients remaining
	 */
	public int numPatients()
	{
		return queue.size();
	}
	
	/**
	 * Gives name of current class
	 * @return String, Name of class used
	 */
	public String hospitalType()
	{
		return "QueueHospital";
	}
	
	/**
	 * Information about all patients in Queue list
	 * @return String, All patient information in Queue list
	 */
	public String allPatientInfo()
	{
		return queue.toString();
	}
}
