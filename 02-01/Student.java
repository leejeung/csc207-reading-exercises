
public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private int age;
	
	/**
	 * Constructor for the class Student
	 *
	 * @param firstName
	 *            first name the student.
	 *        lastName
	 *        	  last name of the student.
	 *        id
	 *            id of the student.
	 *        age
	 *            age of the student.          
	 */
	public Student (String firstName, String lastName, int id, int age) {
		this.firstName = firstName;
		this.lastName  = lastName;
		this.id		   = id;
		this.age	   = age;
	}
	/**
	 * Sets the firstName of the student.
	 *
	 * @param firstName,
	 *            the first name the student.
	 */
	public void setFirstname(String firstName){
		this.firstName = firstName;
	}
	/**
	 * Sets the lastName of the student.
	 *
	 * @param lastName,
	 *            the last name the student.
	 */
	public void setLastname(String lastName){
		this.lastName = lastName;
	}
	/**
	 * Sets the id of the student.
	 *
	 * @param id,
	 *            the id of the student.
	 */
	public void setId(int id){
		this.id = id;
	}
	/**
	 * Sets the age of the student. This value must be non-negative.
	 *
	 * @param age
	 *            the new, non-negative age of the student.
	 * @throws IllegalArgumentException
	 *             if a non-negative age is given.
	 */
	public void setAge(int age){
		if (age >= 0)
			this.age = age;
		else 
			throw new IllegalArgumentException();
	}
	public void getStudent(){
		System.out.printf("Frist Name = %s\nLast Name = %s\nid = %d\nage = %d\n",
						   firstName, lastName, id, age);	
	}

}
