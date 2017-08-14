package entity;

import java.util.Date;

public class EDoc_Entry {
	
	private int id;
	private int categoryid;
	private String title;
	private String summary;
	private String uploaduser;
	private Date createdate;
	private EDoc_Category docCategory;
	public EDoc_Category getDocCategory() {
		return docCategory;
	}
	public void setDocCategory(EDoc_Category docCategory) {
		this.docCategory = docCategory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getUploaduser() {
		return uploaduser;
	}
	public void setUploaduser(String uploaduser) {
		this.uploaduser = uploaduser;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
	
	
	
}
