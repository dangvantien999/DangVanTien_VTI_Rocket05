package com.vti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vti.entity.Department;
import com.vti.service.DepartmentService;

@Controller
@RequestMapping(value = "departments")
public class DepartmentController {
	
	private static final String DEPARTMENT_PREFIX_URL = "department/";

	@Autowired
	private DepartmentService departmentservice;

	@GetMapping(value = { "", "/", "get" })
	public String getAllDepartments(Model model) {
		model.addAttribute("departments", departmentservice.getAllDepartments());

		return DEPARTMENT_PREFIX_URL + "department_list";
	}

	@GetMapping(value = "/{id}")
	public String getDepartmentByID(@PathVariable(name = "id") short id, Model model) {		
		Department department = departmentservice.getDepartmentByID(id);
		model.addAttribute("department", department);

		return DEPARTMENT_PREFIX_URL + "department_add";
	}

	@GetMapping(value = "addInput")
	public String addInput(Model model) {
		model.addAttribute("department", new Department());

		return DEPARTMENT_PREFIX_URL + "department_add";
	}

	@PostMapping(value = "add")
	public String createDepartment(Department department, BindingResult result) {
		departmentservice.createDepartment(department);
//		if(result.hasErrors()) {
//			System.out.println("Error ");
//		}

		return "redirect:get";

//		model.addAttribute("departments", departmentservice.getAllDepartments());
//		return "department/department_list";
	}

	@PutMapping(value = "/{id}")
	public String updateDepartment(@PathVariable(name = "id") short id, @RequestBody Department department) {
		department.setId(id);
		departmentservice.updateDepartment(department);

		return "redirect:get";
	}

	@DeleteMapping(value = "/{id}")
	public String deleteDepartment(@PathVariable(name = "id") short id) {
		departmentservice.deleteDepartment(id);

		return "redirect:get";
	}
}
