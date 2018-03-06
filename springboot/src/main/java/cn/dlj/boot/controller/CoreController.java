package cn.dlj.boot.controller;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

import cn.dlj.boot.dao.UserRepository;
import cn.dlj.boot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dlj.boot.service.CoreService;

@RequestMapping("/")
@org.springframework.stereotype.Controller
public class CoreController {
	
	@Autowired
	private CoreService service;
	@Autowired
	private Executor executor;
	@Autowired
	private RedisTemplate<String, String> template;
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/page")
	public String page() {
		return "index";
	}

	@RequestMapping("/json")
	@ResponseBody
	public String json() {
		return "json数据,实时刷新";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Map<String, Object>> attr() {

		List<Map<String, Object>> list = service.get();
		return list;
	}
	
	@RequestMapping("/one")
	@ResponseBody
	public Map<String,Object> one(int id) {
		return service.getOne(id);
	}
	
	@RequestMapping("/add")
	public void add() {
		service.add();
	}

	@RequestMapping("")
	@ResponseBody
	public List index(){
		return userRepository.findAll();
	}

}
