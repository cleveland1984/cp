package cn.myq.denglu.dao;

import java.util.Date;

import cn.myq.denglu.vo.Admin;

public interface IAdminDAO extends IDAO<String, Admin> {
	
	public Admin findLogin(Admin vo) throws Exception;
	
	public boolean updateLastLoginDate(String adid,Date date) throws Exception;
	
	public boolean updatePassword(String adid,String password) throws Exception;
}
