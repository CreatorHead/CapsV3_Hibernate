package associations.one_to_many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pencil_unidirectional")
public class Pencil {
	
	@Id @Column(name="pencil_id")
	int pencilId;
	
	@Column
	String name;

	public int getPencilId() {
		return pencilId;
	}

	public void setPencilId(int pencilId) {
		this.pencilId = pencilId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
