package model;

public class Student{
    // creation of instance variable
    private int ClientId;
    private String FirstName;
    private String LastName;
    private String PhoneNumber ;
    private String Email;
    private String Password;

    // creation of public getter and setter --> for student ID
	public int getClientId() {
		return this.ClientId;
	}

	public void setClientId(int ClientId) {
		this.ClientId = ClientId;
	}

    // creation of public getter and setter --> for student Name
	public String getFirstName() {
		return this.FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

    // creation of public getter and setter --> for student Age
	public String getLastName() {
		return this.LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

    // creation of public getter and setter --> for student Address
	public String getPhoneNumber() {
		return this.PhoneNumber;
	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}

    // creation of public getter and setter --> for student Contact
	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this. Email= Email;
	}
        public String getPassword() {
		return this.Password;
	}

	public void setPassword(String Password) {
		this. Password= Password;
        }


    // creation of public constructor
    public Student( String FirstName, String LastName, String PhoneNumber, String Email,String Password){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.Password=Password;
    }

   

}