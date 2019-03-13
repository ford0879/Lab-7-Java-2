
public class SickPerson extends Person
{

	/**
	 * Measures seriousness of illness
	 */
	private int severity;
	
	/**
	 * Constructor for SickPerson
	 * @param name
	 * @param age
	 * @param severity
	 */
	public SickPerson(String name, int age, int severity)
	{
		super(name, age);
		this.severity = severity;
	}
	
	/**
	 * Sorts patients in list
	 * @return int, returns -1,0, or 1 to sort patients
	 */
	protected int compareToImpl(Person p)
	{
		if(p instanceof SickPerson)
		{
			if(this.severity > ((SickPerson) p).severity)
			{
				return -1;
			}
			else if(this.severity < ((SickPerson) p).severity)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * 
	 * @return String, Gives information on individual patient
	 */
	public String toString()
	{
		return String.format("%s Severity level %d", getName().toString(), this.severity);
	}
}
