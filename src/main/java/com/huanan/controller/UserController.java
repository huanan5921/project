package com.huanan.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huanan.entity.User;
import com.huanan.service.UserService;
import com.huanan.util.CryptographyUtil;

/**
 * 用户控制器
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/register")
	public Map<String,Object> register(@Valid User user,BindingResult bindingResult)throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		if(bindingResult.hasErrors()){
			map.put("success", false);
			map.put("errorInfo", bindingResult.getFieldError().getDefaultMessage());
		}else if(userService.findByUserName(user.getUserName())!=null){
			map.put("success", false);
			map.put("errorInfo", "用户名已存在，请更换！");
		}else if(userService.findByEmail(user.getEmail())!=null){
			map.put("success", false);
			map.put("errorInfo", "邮箱已存在，请更换！");
		}else{
			user.setPassword(CryptographyUtil.md5(user.getPassword(), CryptographyUtil.SALT));
			user.setRegisterDate(new Date());
			user.setImageName("default.jpg");
			userService.save(user);
			map.put("success", true);
		}
		return map;
	}
}
