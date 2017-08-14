package service;

import java.util.List;
import java.util.Map;

import entity.EDoc_Entry;

public interface ActionService {
	
	
	
	public boolean add(EDoc_Entry enli) ;
	public Map<String,Object> list(int id);
	

}
