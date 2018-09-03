package associations.many_to_many;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="teacher_info")
public class Teacher {

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="teacher_id")
	private int id;

	@Column
	private String name;

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

}
