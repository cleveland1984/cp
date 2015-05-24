package cn.myq.denglu.dao;

import java.util.List;

import cn.myq.denglu.vo.Privilege;

public interface IPrivilegeDAO extends IDAO<Integer, Privilege> {
	
	public List<Privilege> findAllByRole(String rid) throws Exception;
}
