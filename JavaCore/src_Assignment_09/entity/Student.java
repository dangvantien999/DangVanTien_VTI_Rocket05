package entity;

public class Student {
	
	private int id = 1;
	private String name;
	
	public Student() {
		id++;
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Deprecated
	public int getId() {
		return id;
	}
	
	public String getIdV2() {
		return "MSV" + id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
