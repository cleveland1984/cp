package cn.myq.denglu.dao;

import java.util.List;
import java.util.Set;

public interface IDAO<K,V> {
	
	public boolean doCreate(V vo) throws Exception;
	
	public List<V> findAll() throws Exception;
	
	public V findById(K id) throws Exception;
	
	public boolean doUpdate(V vo) throws Exception;
	
	public boolean doRemoveBatch(Set<K> ids) throws Exception;
}
