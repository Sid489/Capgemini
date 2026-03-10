package oneTomany.bidirectional;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eId;
	private String eName;
	private int eAge;
	private double eSal;
	@ManyToOne()
	@JoinColumn(name = "dept_id")
	private Department dept;
	
	public Employee() {
		

	}
	
	public Employee(String eName, int eAge, double eSal,Department dept) {
		super();
		this.eName = eName;
		this.eAge = eAge;
		this.eSal = eSal;
		this.dept = dept;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	public double geteSal() {
		return eSal;
	}
	public void seteSal(double eSal) {
		this.eSal = eSal;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eAge=" + eAge + ", eSal=" + eSal + ", dept=" + dept
				+ "]";
	}
	
	
	
	
}
