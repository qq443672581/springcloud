package cn.dlj1.springboot.controller;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

import cn.dlj1.springboot.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dlj1.springboot.service.CoreService;

import javax.transaction.Transactional;

@RequestMapping("/")
@org.springframework.stereotype.Controller
@Transactional
public class CoreController {
	
	@Autowired
	private CoreService service;
	@Autowired
	private Executor executor;
	@Autowired
	private RedisTemplate<String, String> template;

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
		return service.get();
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
	public String index() {
        return "6";
	}

}
