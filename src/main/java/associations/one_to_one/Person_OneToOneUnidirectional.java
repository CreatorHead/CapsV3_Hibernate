package associations.one_to_one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="person_one_to_one")
public class Person_OneToOneUnidirectional {
	
	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int age;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addr_id", referencedColumnName="addrs_id")
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
