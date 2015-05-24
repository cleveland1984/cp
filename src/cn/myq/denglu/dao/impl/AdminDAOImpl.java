package cn.myq.denglu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import java.util.Set;

import cn.myq.denglu.dao.IAdminDAO;
import cn.myq.denglu.vo.Admin;

public class AdminDAOImpl implements IAdminDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	
	public AdminDAOImpl(Connection conn){
		this.conn = conn;
	}
	@Override
	public boolean doCreate(Admin vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Admin> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doUpdate(Admin vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemoveBatch(Set<String> ids) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Admin findLogin(Admin vo) throws Exception {
		String sql = "select adid,rid,password,lastlogin,flag from admin where adid=? and password=?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, vo.getAdid());
		this.pstmt.setString(2, vo.getPassword());
		ResultSet rs = this.pstmt.executeQuery();
		if(rs.next()){
			vo.getRole().setRid(rs.getInt(2));
			vo.setLastlogin(rs.getTimestamp(4));
			vo.setFlag(rs.getInt(5));
		}
		return vo;
	}

	@Override
	public boolean updateLastLoginDate(String adid, Date date) throws Exception {
		String sql = "update admin set lastlogin=? where adid=?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setTimestamp(1, new java.sql.Timestamp(date.getTime()));
		this.pstmt.setString(2, adid);
		if(this.pstmt.executeUpdate() > 0){
			return true;
		}
		return false;
		
	}

	@Override
	public boolean updatePassword(String adid, String password)
			throws Exception {
		String sql = "update admin set password=? where adid=?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, password);
		this.pstmt.setString(2, adid);
		if(this.pstmt.executeUpdate() > 0){
			return true;
		}
		return false;
	}

}
