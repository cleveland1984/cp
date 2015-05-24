package cn.myq.denglu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.myq.denglu.dao.IPrivilegeDetailsDAO;
import cn.myq.denglu.vo.PrivilegeDetails;

public class PrivilegeDetailsDAOImpl implements IPrivilegeDetailsDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	
	public PrivilegeDetailsDAOImpl(Connection conn){
		this.conn = conn;
	}
	@Override
	public boolean doCreate(PrivilegeDetails vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<PrivilegeDetails> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrivilegeDetails findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doUpdate(PrivilegeDetails vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemoveBatch(Set<Integer> ids) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<Integer, List<PrivilegeDetails>> findAllByPrivilege(
			Set<Integer> pids) throws Exception {
		Map<Integer,List<PrivilegeDetails>> map = new HashMap<Integer,List<PrivilegeDetails>>();
		if(pids == null || pids.size() == 0){
			return map;
		}
		StringBuffer sql = new StringBuffer();
		sql.append("select pdid,pid,title,url from privilege_details where pid in (");
		Iterator<Integer> iter = pids.iterator();
		while(iter.hasNext()){
			Integer pid = iter.next();
			map.put(pid, new ArrayList<PrivilegeDetails>());
			sql.append(pid).append(",");
		}
		sql.delete(sql.length()-1,sql.length());
		sql.append(")");
		this.pstmt = this.conn.prepareStatement(sql.toString());
		ResultSet rs = this.pstmt.executeQuery();
		while(rs.next()){
			PrivilegeDetails pd = new PrivilegeDetails();
			pd.setPdid(rs.getInt(1));
			pd.getPrivilege().setPid(rs.getInt(2));
			pd.setTitle(rs.getString(3));
			pd.setNote(rs.getString(4));
			map.get(pd.getPrivilege().getPid()).add(pd);
		}
		return map;
	}

}
