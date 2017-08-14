package action;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;

import daoIMPL.ActionServiceDaoImpl;
import entity.EDoc_Category;
import entity.EDoc_Entry;
import util.HibernateSessionFactory;

public class RequiredAction extends ActionSupport{

	/**
	 * 
	 */
	private List<EDoc_Entry> infosList ;
	private List<EDoc_Category>	CategorysList;
	private int id;
	private static final long serialVersionUID = 5294380527260919605L;
	Session session = HibernateSessionFactory.getSession();
	Transaction ts = session.getTransaction();
	private EDoc_Entry enli = new EDoc_Entry();
	Logger logger = (Logger)LogManager.getLogger();
	@SuppressWarnings("unchecked")
	public String execute() {
		
		Map<String,Object> maps = new daoIMPL.ActionServiceDaoImpl().list(this.id);
		//获取字典

		infosList = (List<EDoc_Entry>)maps.get("info");
		CategorysList = (List<EDoc_Category>)maps.get("cate");
		
		return SUCCESS;
		
		
	}

	public String addItem() {
		
		ActionServiceDaoImpl tempObj = new daoIMPL.ActionServiceDaoImpl();
		if(tempObj.addItem(enli)) {
			//成功
			logger.debug("成功添加");
			return SUCCESS;
			
		}else {
			//失败
			logger.debug("失败");
			return INPUT;
			
			
		}
		
		
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EDoc_Entry getEnli() {
		return enli;
	}

	public void setEnli(EDoc_Entry enli) {
		this.enli = enli;
	}
	
	
}
