package associations.many_to_many;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="students_info")
public class Students_Unidirectional {

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
	private int id;

	@Column
	private String name;

	@Column
	private int age;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="students_teachers",joinColumns=@JoinColumn(name="student_id")
												,inverseJoinColumns=@JoinColumn(name="teacher_id"))
	private Set<Teacher> list;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Set<Teacher> getList() {
		return list;
	}

	public void setList(Set<Teacher> list) {
		this.list = list;
	}



}
