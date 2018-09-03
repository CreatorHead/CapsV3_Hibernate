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
@Table(name="bucket_bidirectional")
public class Bucket_Bidirectional {
	
	@Id 
	int bucket_id;
	
	@Column
	String name;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="bucket")
	List<IceCube> iceCube;

	public int getBucket_id() {
		return bucket_id;
	}

	public void setBucket_id(int bucket_id) {
		this.bucket_id = bucket_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<IceCube> getIceCube() {
		return iceCube;
	}

	public void setIceCube(List<IceCube> iceCube) {
		this.iceCube = iceCube;
	}

	
}
