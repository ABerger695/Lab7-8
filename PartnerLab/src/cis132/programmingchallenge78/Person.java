package cis132.programmingchallenge78;

public class Person {

	public String name, address, telephone;
	
	public Person(String name, String address, String telephone){
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getTelephone(){
		return telephone;
	}
	
}
