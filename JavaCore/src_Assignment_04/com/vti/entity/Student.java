package com.vti.entity;


public class Student {
	
	private int id;
	private String name;
	private String homeTown;
	private float Diem;
	

	public Student( String name, String homeTown) {
		super();
		this.name = name;
		this.homeTown = homeTown;
		this.Diem = 0;
	}


	public int getId() {
		return id;
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


	public String getHomeTown() {
		return homeTown;
	}


	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public float getDiem() {
		return Diem;
	}


	public void setDiem(float Diem) {
		this.Diem = Diem;
	}

	public void CongDiem(float diem) {
		this.Diem += diem;
	}
	
	public String toString() {
		String XepLoai;
		if (Diem < 4) {
			XepLoai = "Yếu";
		} else if (Diem < 6) {
			XepLoai = "Trung bình";
		} else if (Diem < 8) {
			XepLoai = "Khá";
		} else {
			XepLoai = "Giỏi";
		}

		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", hometown='" + homeTown + '\'' + ", Điểm="
				+ Diem + ", xepLoai='" + XepLoai + '\'' + '}';
	}
	

}
