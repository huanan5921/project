package com.huanan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.huanan.entity.User;

/**
 * 用户Respository接口
 * @author Administrator
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>,JpaSpecificationExecutor<User>{

	/**
	 * 根据用户名查找用户实体
	 * @param userName
	 * @return
	 */
	@Query(value="select * from t_user where user_name=?1",nativeQuery=true)
	public User findByUserName(String userName);
	
	/**
	 * 根据邮箱查找用户实体
	 * @param email
	 * @return
	 */
	@Query(value="select * from t_user where email=?1",nativeQuery=true)
	public User findByEmail(String email);
}
