package com.vti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vti.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Short> {

//	public List<Department> getAllDepartments();
//
//	public Department getDepartmentByID(short id);
//
//	public Department getDepartmentByName(String name);
//
//	public void createDepartment(Department department);
//
//	public void updateDepartment(short id, String newName);
//
//	public void updateDepartment(Department department);
//
//	public void deleteDepartment(short id);
//
//	public boolean isDepartmentExistsByID(short id);
//
//	public boolean isDepartmentExistsByName(String name);

}
