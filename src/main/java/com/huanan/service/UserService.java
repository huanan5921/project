package com.huanan.service;

import com.huanan.entity.User;

/**
 * 用户Service接口
 * @author Administrator
 *
 */
public interface UserService {

	/**
	 * 添加或者修改用户信息
	 * @param user
	 */
	public void save(User user);
	
	/**
	 * 根据用户名查找用户实体
	 * @param userName
	 * @return
	 */
	public User findByUserName(String userName);
	
	/**
	 * 根据邮箱查找用户实体
	 * @param email
	 * @return
	 */
	public User findByEmail(String email);
	
	
}
