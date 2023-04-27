package tutorial4.mapping.ManyToMany;

import java.util.List;

import javax.persistence.*;

@Entity
public class Projects
{
	@Id
	private int id;
	
	private String projectName;
	
	@ManyToMany
	@JoinTable(name="emp_pro",joinColumns = {@JoinColumn(name="project_id")}, 
					inverseJoinColumns= {@JoinColumn(name="employee_id")})
	private List<Employees> emp;
	
	public List<Employees> getEmp()
	{
		return emp;
	}
	public void setEmp(List<Employees> emp)
	{
		this.emp = emp;
	}
	public int getId()
	{
		return id;
	}
	public String getProjectName()
	{
		return projectName;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setProjectName(String projectName)
	{
		this.projectName = projectName;
	}
}
