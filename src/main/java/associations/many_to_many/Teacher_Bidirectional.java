package associations.many_to_many;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="teacher_info_bidirectional")
public class Teacher_Bidirectional {

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="teacher_id")
	private int id;

	@Column
	private String name;

	@ManyToMany(cascade=CascadeType.ALL,mappedBy="teachers")
	private Set<Students_Bidirectional> students = null;
	
	@Column
	private String subject;

	
	
	
	
	
	
	
	
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Set<Students_Bidirectional> getStudents() {
		return students;
	}

	public void setStudents(Set<Students_Bidirectional> students) {
		this.students = students;
	}

}
