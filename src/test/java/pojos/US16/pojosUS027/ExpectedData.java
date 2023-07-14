package pojos.US16.pojosUS027;

public class ExpectedData {
	private String subject;
	private String name;
	private String message;
	private String email;

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}



	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}


	@Override
	public String toString() {
		return "ExpectedData{" +
				"subject='" + subject + '\'' +
				", name='" + name + '\'' +
				", message='" + message + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
