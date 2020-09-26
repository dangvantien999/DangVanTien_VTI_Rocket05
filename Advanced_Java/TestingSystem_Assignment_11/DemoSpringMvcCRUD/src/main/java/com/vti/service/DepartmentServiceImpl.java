package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Department;
import com.vti.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {


	@Autowired
	private DepartmentRepository departmentrepository;
	

	public List<Department> getAllDepartments() {
		return departmentrepository.findAll();
	}

	public Department getDepartmentByID(short id) {
		return departmentrepository.getOne(id);
	}

	public Department getDepartmentByName(String name) {
		return null;
//		return departmentrepository.getDepartmentByName(name);
	}

	public void createDepartment(Department department) {
		departmentrepository.save(department);
		
	}

	public void updateDepartment(short id, String newName) {
		
		Department department = new Department();
		department.setId(id);
		department.setName(newName);
		departmentrepository.save(department);
	}

	public void updateDepartment(Department department) {
		departmentrepository.save(department);
	}

	public void deleteDepartment(short id) {
		departmentrepository.deleteById(id);
	}

	public boolean isDepartmentExistsByID(short id) {
//		return departmentrepository.isDepartmentExistsByID(id);
		return false;
	}

	public boolean isDepartmentExistsByName(String name) {
//		return departmentrepository.isDepartmentExistsByName(name);
		return false;
	}
}
