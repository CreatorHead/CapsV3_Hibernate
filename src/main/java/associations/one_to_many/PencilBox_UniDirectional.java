package associations.one_to_many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pencilBox_UniDirectional")
public class PencilBox_UniDirectional {
	@Id
	@Column(name="box_id")
	int id;
	
	@Column
	String size;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="box_id",nullable=false)
	List<Pencil> pencils;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public List<Pencil> getPencils() {
		return pencils;
	}

	public void setPencils(List<Pencil> pencils) {
		this.pencils = pencils;
	}
}
