
public class HealthyPerson extends Person
{

	/**
	 * Reason for healthy person to be in hospital
	 */
	private String reason;
	
	/**
	 * Constructor for HealthyPerson class
	 * @param name
	 * @param age
	 * @param reason
	 */
	public HealthyPerson(String name, int age, String reason)
	{
		super(name, age);
		this.reason = reason;
	}
	
	/**
	 * Sorts patients in list
	 * @return int, returns -1,0, or 1 to sort patients
	 */
	protected int compareToImpl(Person p)
	{
		if(this.getName().compareToIgnoreCase(p.getName()) < 0)
		{
			return -1;
		}
		else if(this.getName().compareToIgnoreCase(p.getName()) > 0)
		{
			return 1;
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
		return String.format("%s In for %s", getName().toString(), reason);
	}
}
