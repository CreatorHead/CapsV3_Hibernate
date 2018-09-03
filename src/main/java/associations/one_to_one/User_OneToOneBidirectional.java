package associations.one_to_one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User_OneToOneBidirectional {
	
	@Id
	private int user_id;
	
	@Column
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="voter_id")
	private VoterCard voterCard;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VoterCard getVoterCard() {
		return voterCard;
	}

	public void setVoterCard(VoterCard voterCard) {
		this.voterCard = voterCard;
	}
}
