package com.CRUD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int save(Employee e) {
		String query="insert into emp99(name, salary, designation) values ('"+e.getName()+"','"+e.getSalary()+"','"+e.getDesignation()+"')";
		return template.update(query);
	}
	public int update(Employee e) {
		String query="update emp99 set name='"+e.getName()+"',salary='"+e.getSalary()+"',designation='"+e.getDesignation()+"' where id='"+e.getId()+"'";
		return template.update(query);
	}
	public int delete(int id) {
		String query="delete from emp99 where id='"+id+"'";
		return template.update(query);
	}
	public Employee getEmpById(int id) {
		String query = "select * from emp99 where id=?";
	return template.queryForObject(query, new Object[]{id}, new BeanPropertyRowMapper<Employee>(Employee.class));
	}
	public List<Employee> getEmployees(){
		return template.query("select * from emp99", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				return e;
			}
			
		});
	}
}
