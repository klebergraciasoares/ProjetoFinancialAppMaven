package cursojpajsfk19.entitys;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@OneToMany(mappedBy = "department")
	private Collection<StudentNew> students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String deptName) {
		this.name = deptName;
	}

	public Collection<StudentNew> getStudents() {
		return students;
	}

	public void setStudent(Collection<StudentNew> students) {
		this.students = students;
	}

	public String toString() {
		return "Department id: " + getId() + ", name: " + getName();
	}
}