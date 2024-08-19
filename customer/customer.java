package OneWeekSession;

//customer class with attributes
public class customer
{
	int id;
	String name;
	String email;
	
	public customer(int id,String name, String email)
	{
		this.id=id;
		this.name=name;
		this.email=email;
	}

	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	

}
