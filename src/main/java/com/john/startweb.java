package com.john;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.john.dao.UserDao;
import com.john.entity.UserEntity;
import com.john.service.UserService;

@SpringBootApplication
@Controller
public class startweb{
   
	@Autowired
	private UserService service;
	
	
	@RequestMapping("/hello")
    @ResponseBody
    public String hello() {
		List<UserEntity> list = service.getAll();
		if(list.size()>0) {
			 return list.get(0).getName();
		}
        return "啥也没有";
    }
	
	@RequestMapping("/hellosave")
    @ResponseBody
    public String hellosave() {
		UserEntity e = new UserEntity();
		e.setAge("10");
		e.setAiHao("LOL");
		e.setName("John");
		e.setXingQu("LP1");
		service.save(e);
        return "保存成功";
    }
	
	 public static void main(String[] args)
    {
        SpringApplication.run(startweb.class, args);
    }

}
