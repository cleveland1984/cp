package cn.myq.denglu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import cn.myq.denglu.dao.IPrivilegeDAO;
import cn.myq.denglu.vo.Privilege;

public class PrivilegeDAOImpl implements IPrivilegeDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	
	public PrivilegeDAOImpl(Connection conn){
		this.conn = conn;
	}
	@Override
	public boolean doCreate(Privilege vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Privilege> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Privilege findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doUpdate(Privilege vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemoveBatch(Set<Integer> ids) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Privilege> findAllByRole(String rid) throws Exception {
		String sql = "select pid,title,note from privilege where pid in "
				+ " (select pid from role_privilege where rid=?)";
		this.pstmt = this.conn.prepareStatement(sql);
		ResultSet rs = this.pstmt.executeQuery();
		List<Privilege> all = new ArrayList<Privilege>();
		while(rs.next()){
			Privilege vo = new Privilege();
			vo.setPid(rs.getInt(1));
			vo.setTitle(rs.getString(2));
			vo.setNote(rs.getString(3));
			all.add(vo);
		}
		return all;
	}


}
