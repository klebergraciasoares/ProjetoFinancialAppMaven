package cursojpajsfk19.entitys;

import javax.persistence.*;

@Table ( name ="ligacoes")
@Entity
public class Call {

	@Id
	@GeneratedValue
	private int id;

	@ManyToOne
	@JoinColumn(name = "cellular_id")
	private Celular cellular;

	private long duration;
	

	// get and set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Celular getCellular() {
		return cellular;
	}

	public void setCellular(Celular cellular) {
		this.cellular = cellular;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	
}