package app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name="student")
@javax.persistence.NamedQuery(name="studentRecords", query="SELECT st FROM Student st WHERE st.sname= ?1 OR st.scourse= ?2")
@NamedQueries({
    @NamedQuery(name="allStudentRecords",query="SELECT st FROM Student st WHERE st.sroll > ?1"),
    @NamedQuery(name="updateStudentRecords", query="UPDATE Student st SET st.sname= ?1 WHERE st.sname= ?2")
})

public class Student {
	
	@Id
	@GeneratedValue
	private Long id;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="sname", length=100,nullable=false)
	private String sname;

	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}

	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Column(name="sroll",nullable=false)
	private int sroll;

	/**
	 * @return the sroll
	 */
	public int getSroll() {
		return sroll;
	}

	/**
	 * @param sroll the sroll to set
	 */
	public void setSroll(int sroll) {
		this.sroll = sroll;
	}
	
	@Column(name="scourse",length=10,nullable=false)
	private String scourse;

	/**
	 * @return the scourse
	 */
	public String getScourse() {
		return scourse;
	}

	/**
	 * @param scourse the scourse to set
	 */
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	
}
