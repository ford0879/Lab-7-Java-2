import org.junit.Assert;
import org.junit.Test;

public class PersonAndHospitalTests 
{

	/**
	 * Tests that patients are properly added to StackHospital list
	 */
	@Test
	public void addPatientTest()
	{
		StackHospital<Animal> animalStack = new StackHospital<Animal>();
		animalStack.addPatient((new Animal("Lab", 3)));
		animalStack.addPatient(new Animal("Tabby", 8));
		String actual = animalStack.toString();
		String expected = "A StackHospital-type hospital with 2 patients.";
		
		Assert.assertEquals(expected, actual);
		
		StackHospital<Person> personStack = new StackHospital<Person>();
		personStack.addPatient((new SickPerson("a", 3, 2)));
		actual = personStack.toString();
		expected = "A StackHospital-type hospital with 1 patients.";
		
		Assert.assertEquals(expected, actual);
		
		
		QueueHospital<Person> personQueue = new QueueHospital<Person>();
		personQueue.addPatient((new SickPerson("a", 3, 2)));
		actual = personQueue.toString();
		expected = "A QueueHospital-type hospital with 1 patients.";
		
		Assert.assertEquals(expected, actual);
		
		
		PriorityQueueHospital<Person> personPrioQueue = new PriorityQueueHospital<Person>();
		personPrioQueue.addPatient((new SickPerson("a", 3, 2)));
		actual = personPrioQueue.toString();
		expected = "A PriorityQueueHospital-type hospital with 1 patients.";
		
		Assert.assertEquals(expected, actual);
		
	}
	
	/**
	 * Tests that next patient on list is properly returned
	 */
	@Test
	public void nextPatientTest()
	{
		StackHospital<Animal> animalStack = new StackHospital<Animal>();
		animalStack.addPatient((new Animal("Cat", 3)));
		animalStack.addPatient(new Animal("Dog", 8));
		String actual = animalStack.nextPatient().toString();
		String expected = "A 8-year old Dog.";
		
		Assert.assertEquals(expected, actual);
		
		StackHospital<Person> personStack = new StackHospital<Person>();
		personStack.addPatient((new SickPerson("a", 3, 2)));
		personStack.addPatient(new SickPerson("b", 5, 5));
		actual = personStack.nextPatient().toString();
		expected = "b Severity level 5";
		
		Assert.assertEquals(expected, actual);
		
		
		QueueHospital<Person> personQueue = new QueueHospital<Person>();
		personQueue.addPatient((new SickPerson("a", 3, 2)));
		personQueue.addPatient(new SickPerson("b", 5, 5));
		actual = personQueue.nextPatient().toString();
		expected = "b Severity level 5";
		
		Assert.assertEquals(expected, actual);
		
		
		PriorityQueueHospital<Person> personPrioQueue = new PriorityQueueHospital<Person>();
		personPrioQueue.addPatient((new HealthyPerson("a", 3, "Sneeze")));
		personPrioQueue.addPatient(new HealthyPerson("b", 5, "Cough"));
		actual = personPrioQueue.nextPatient().toString();
		expected = "a In for Sneeze";
		
		Assert.assertEquals(expected, actual);
	}
	/**
	 * Tests that next patient on list is properly removed and returned
	 */
	@Test
	public void treatNextPatientTest()
	{
		StackHospital<Animal> animalStack = new StackHospital<Animal>();
		animalStack.addPatient((new Animal("Cat", 3)));
		animalStack.addPatient(new Animal("Dog", 8));
		String actual = animalStack.treatNextPatient().toString();
		String expected = "A 8-year old Dog.";
		
		Assert.assertEquals(expected, actual);
		
		StackHospital<Person> personStack = new StackHospital<Person>();
		personStack.addPatient((new SickPerson("a", 3, 2)));
		personStack.addPatient(new SickPerson("b", 5, 5));
		actual = personStack.treatNextPatient().toString();
		expected = "b Severity level 5";
		
		Assert.assertEquals(expected, actual);
		
		QueueHospital<Person> personQueue = new QueueHospital<Person>();
		personQueue.addPatient((new SickPerson("a", 3, 2)));
		personQueue.addPatient(new SickPerson("b", 5, 5));
		actual = personQueue.treatNextPatient().toString();
		expected = "b Severity level 5";
		
		Assert.assertEquals(expected, actual);
		
		
		PriorityQueueHospital<Person> personPrioQueue = new PriorityQueueHospital<Person>();
		personPrioQueue.addPatient((new HealthyPerson("a", 3, "Sneeze")));
		personPrioQueue.addPatient(new HealthyPerson("b", 6, "Cough"));
		actual = personPrioQueue.treatNextPatient().toString();
		expected = "a In for Sneeze";
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests that size of patient list is properly returned
	 */
	@Test
	public void numPatientsTest()
	{
		StackHospital<Animal> animalStack = new StackHospital<Animal>();
		animalStack.addPatient(new Animal("Cat", 3));
		animalStack.addPatient(new Animal("Dog", 8));
		int actual = animalStack.numPatients();
		int expected = 2;
		
		Assert.assertEquals(expected, actual);
		
		
		QueueHospital<Person> personQueue = new QueueHospital<Person>();
		personQueue.addPatient((new SickPerson("a", 3, 2)));
		personQueue.addPatient(new SickPerson("b", 5, 5));
		actual = personQueue.numPatients();
		expected = 2;
		
		Assert.assertEquals(expected, actual);
		
		
		PriorityQueueHospital<Person> personPrioQueue = new PriorityQueueHospital<Person>();
		personPrioQueue.addPatient((new HealthyPerson("a", 3, "Sneeze")));
		personPrioQueue.addPatient(new HealthyPerson("b", 6, "Cough"));
		actual = personPrioQueue.numPatients();
		expected = 2;
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests that the correct Hospital class is returned
	 */
	@Test
	public void hospitalTypeTest()
	{
		StackHospital<Animal> animalStack = new StackHospital<Animal>();
		String actual = animalStack.hospitalType();
		String expected = "StackHospital";
		
		Assert.assertEquals(expected, actual);
		
		QueueHospital<Person> personQueue = new QueueHospital<Person>();
		actual = personQueue.hospitalType();
	    expected = "QueueHospital";
		
		Assert.assertEquals(expected, actual);
		
		PriorityQueueHospital<Person> personPrioQueue = new PriorityQueueHospital<Person>();
		actual = personPrioQueue.hospitalType();
	    expected = "PriorityQueueHospital";
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests that patient information is returned properly
	 */
	@Test
	public void allPatientInfoTest()
	{
		StackHospital<Animal> animalStack = new StackHospital<Animal>();
		animalStack.addPatient(new Animal("Cat", 3));
		animalStack.addPatient(new Animal("Dog", 8));
		String actual = animalStack.allPatientInfo();
		String expected = "[A 3-year old Cat., A 8-year old Dog.]";
		
		Assert.assertEquals(expected, actual);
		
		QueueHospital<Person> personQueue = new QueueHospital<Person>();
		personQueue.addPatient((new SickPerson("a", 3, 2)));
		personQueue.addPatient(new SickPerson("b", 5, 5));
		actual = personQueue.allPatientInfo();
		expected = "[b Severity level 5, a Severity level 2]";
		
		Assert.assertEquals(expected, actual);
		
		
		PriorityQueueHospital<Person> personPrioQueue = new PriorityQueueHospital<Person>();
		personPrioQueue.addPatient((new HealthyPerson("a", 3, "Sneeze")));
		personPrioQueue.addPatient(new HealthyPerson("b", 6, "Cough"));
		actual = personPrioQueue.allPatientInfo();
		expected = "[a In for Sneeze, b In for Cough]";
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests that persons on list are properly sorted
	 */
	@Test
	public void compareToImplTest()
	{
		Person sick = new SickPerson("a", 5, 5);
		Person sickTwo = new SickPerson("b", 10, 10);
		int sickActual = sick.compareTo(sickTwo);
		int sickExpected = 1;
		
		Assert.assertEquals(sickExpected, sickActual);
		
		sickActual = sickTwo.compareTo(sick);
		sickExpected = -1;
		
		Assert.assertEquals(sickExpected, sickActual);
		
		
		Person healthy = new HealthyPerson("c", 15, "Cough");
		Person healthyTwo = new HealthyPerson("d", 20, "Dead");
		int healActual = healthy.compareTo(healthyTwo);
		int healExpected = -1;
		
		Assert.assertEquals(healExpected,healActual);
	}
	
	/**
	 * Tests that toString is properly formatted
	 */
	@Test
	public void toStringTest()
	{
		Person sick = new SickPerson("a", 5, 5);
		String actual = sick.toString();
		String expected = "a Severity level 5";
		
		Assert.assertEquals(expected, actual);
		
		Person healthy = new HealthyPerson("b", 10, "Cough");
		actual = healthy.toString();
		expected = "b In for Cough";
		
		Assert.assertEquals(expected, actual);
	}
}
