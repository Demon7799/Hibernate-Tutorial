package tutorial4.mapping.ManyToMany;

import java.util.List;

import javax.persistence.*;

@Entity
public class Employees
{
	@Id
	private int id;
	
	private String empName;
	
	@ManyToMany(mappedBy = "emp")
	private List<Projects> projects;
	
	public List<Projects> getProjects()
	{
		return projects;
	}
	public void setProjects(List<Projects> projects)
	{
		this.projects = projects;
	}
	public int getId()
	{
		return id;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
}
