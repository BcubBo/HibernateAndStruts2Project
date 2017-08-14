package action;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;

import entity.EDoc_Category;
import entity.EDoc_Entry;
import util.HibernateSessionFactory;

public class RequiredAction extends ActionSupport{

	/**
	 * 
	 */
	private List<EDoc_Entry> infosList ;
	private List<EDoc_Category>	CategorysList;
	private static final long serialVersionUID = 5294380527260919605L;
	Session session = HibernateSessionFactory.getSession();
	Transaction ts = session.getTransaction();
	
	
	public String execute() {
		



		
		
			
		
		
		return SUCCESS;
		
		
	}

	public String add() {
		
		
		
		
		
		return SUCCESS;
		
		
		
	}

	public List<EDoc_Entry> getInfosList() {
		return infosList;
	}



	public void setInfosList(List<EDoc_Entry> infosList) {
		this.infosList = infosList;
	}



	public List<EDoc_Category> getCategorysList() {
		return CategorysList;
	}



	public void setCategorysList(List<EDoc_Category> categorysList) {
		CategorysList = categorysList;
	}
	
	
}
