package associations.one_to_one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class VoterCard {
	
	@Id
	private int voter_id;
	
	@OneToOne(mappedBy="voterCard")
	private User_OneToOneBidirectional user;

	@Column
	private String dob;
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getVoter_id() {
		return voter_id;
	}

	public void setVoter_id(int voter_id) {
		this.voter_id = voter_id;
	}

	public User_OneToOneBidirectional getUser() {
		return user;
	}

	public void setUser(User_OneToOneBidirectional user) {
		this.user = user;
	}
	
	
}
