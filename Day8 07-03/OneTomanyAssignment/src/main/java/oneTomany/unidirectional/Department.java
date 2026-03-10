package oneTomany.unidirectional;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dId;
	private String dNAme;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employee> emp;
	
	public Department() {

	}
	
	
	public Department(String dNAme, List<Employee> emp) {
		super();
		this.dNAme = dNAme;
		this.emp = emp;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdNAme() {
		return dNAme;
	}
	public void setdNAme(String dNAme) {
		this.dNAme = dNAme;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
	

}
