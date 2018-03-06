package cn.dlj1.springboot.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CoreDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Map<String, Object>> getList(){
		
		return jdbcTemplate.queryForList("select * from user");
	}
	
	public Map<String, Object> getOne(int id){
		
		return jdbcTemplate.queryForMap("select * from user where id = ?", id);
	}
	
	public void add(){
		
		
		jdbcTemplate.update("insert into user(name) value(?)", 666);
	}

}
