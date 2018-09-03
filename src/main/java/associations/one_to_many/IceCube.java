package associations.one_to_many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class IceCube {
	@Id
	int iceCubeId;
	
	@Column
	String size;
	
	@ManyToOne
	@JoinColumn(name="bucket_id")
	Bucket_Bidirectional bucket;

	public int getIceCubeId() {
		return iceCubeId;
	}

	public void setIceCubeId(int iceCubeId) {
		this.iceCubeId = iceCubeId;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Bucket_Bidirectional getBucket() {
		return bucket;
	}

	public void setBucket(Bucket_Bidirectional bucket) {
		this.bucket = bucket;
	}
	
	
}
