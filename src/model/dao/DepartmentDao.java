package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);
	void update(Department obj);
	void deletById(Integer id);
	Department fyndById(Integer id);
	List <Department> fyndAll();
	
	
}
