package entity;

import java.util.Set;

public class EDoc_Category {
	private int id;
	private String name;
	private Set<EDoc_Entry> docEntrys;
	public Set<EDoc_Entry> getDocEntrys() {
		return docEntrys;
	}
	public void setDocEntrys(Set<EDoc_Entry> docEntrys) {
		this.docEntrys = docEntrys;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
