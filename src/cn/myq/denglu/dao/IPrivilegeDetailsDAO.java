package cn.myq.denglu.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.myq.denglu.vo.PrivilegeDetails;

public interface IPrivilegeDetailsDAO extends IDAO<Integer, PrivilegeDetails> {
	
	public Map<Integer,List<PrivilegeDetails>> findAllByPrivilege(Set<Integer> pids) throws Exception;
}
