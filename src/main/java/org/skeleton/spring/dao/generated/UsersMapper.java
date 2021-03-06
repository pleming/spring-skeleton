package org.skeleton.spring.dao.generated;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.skeleton.spring.dto.generated.Users;
import org.skeleton.spring.dto.generated.UsersExample;

public interface UsersMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Thu Sep 28 16:55:14 KST 2017
	 */
	long countByExample(UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Thu Sep 28 16:55:14 KST 2017
	 */
	int deleteByExample(UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Thu Sep 28 16:55:14 KST 2017
	 */
	int deleteByPrimaryKey(String userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Thu Sep 28 16:55:14 KST 2017
	 */
	int insert(Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Thu Sep 28 16:55:14 KST 2017
	 */
	int insertSelective(Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Thu Sep 28 16:55:14 KST 2017
	 */
	List<Users> selectByExample(UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Thu Sep 28 16:55:14 KST 2017
	 */
	Users selectByPrimaryKey(String userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Thu Sep 28 16:55:14 KST 2017
	 */
	int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Thu Sep 28 16:55:14 KST 2017
	 */
	int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Thu Sep 28 16:55:14 KST 2017
	 */
	int updateByPrimaryKeySelective(Users record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table users
	 * @mbg.generated  Thu Sep 28 16:55:14 KST 2017
	 */
	int updateByPrimaryKey(Users record);
}