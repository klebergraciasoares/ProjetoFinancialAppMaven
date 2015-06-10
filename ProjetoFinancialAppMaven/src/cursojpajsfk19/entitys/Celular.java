package cursojpajsfk19.entitys;

import java.util.List;

import javax.persistence.*;

import app.Student;

@Entity
public class Celular {

	@Id
	@GeneratedValue
	private int id;

//	@OneToOne(mappedBy = "cellular")
//	private Student student;

	@OneToMany(mappedBy = "cellular")
	private List<Call> calls;

	private String number;

	// get and set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}

	public List<Call> getCalls() {
		return calls;
	}

	public void setCalls(List<Call> calls) {
		this.calls = calls;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}


	
}