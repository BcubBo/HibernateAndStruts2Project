package daoIMPL;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.EDoc_Category;
import entity.EDoc_Entry;
import service.ActionService;
import util.HibernateSessionFactory;

public class ActionServiceDaoImpl implements ActionService{
	Session session = HibernateSessionFactory.getSession();
	Transaction ts = session.getTransaction();
	private List<EDoc_Entry> infosList ;
	private List<EDoc_Category>	CategorysList;
	Logger logger =(Logger)LogManager.getLogger();
	@Override
	public boolean addItem(EDoc_Entry enli) {
		boolean flag = false;
		try {
					ts.begin();
					EDoc_Entry ee1 = new EDoc_Entry();
					Set<EDoc_Entry> eeSet = new HashSet<EDoc_Entry>();
					ee1.setCategoryid(enli.getCategoryid());
					//
					ee1.setCreatedate(new Date());
					//
					logger.debug("enli中:"+enli.getTitle());
					//
					ee1.setTitle(enli.getTitle());
					//
					ee1.setSummary(enli.getSummary());
					//
					ee1.setUploaduser(enli.getUploaduser());
					//
					eeSet.add(ee1);
					//
					EDoc_Category ec1 = new EDoc_Category();
					//
					ec1.setDocEntrys(eeSet);
					//
					ec1.setName("testTitle2");
					//
					ec1.setId(enli.getCategoryid());
					//
					ee1.setDocCategory(ec1);
					//
					session.save(ee1);
					//
					ts.commit();
					//
					flag = true;
					
					
				}catch(Exception e) {
					if(session!=null) {
						ts.rollback();
						flag =false;
					}
					e.printStackTrace();
			
				}
		
		
		return flag;

	}

	@Override
	public Map<String,Object> list(int id) {
		
		@SuppressWarnings("unchecked")
		List<EDoc_Category> ecList = HibernateSessionFactory.getSession().createQuery("from EDoc_Category").list();
		for(EDoc_Category ec:ecList) {
			Set<EDoc_Entry> enSet = ec.getDocEntrys();
			for(EDoc_Entry ee:enSet) {
				System.out.println("结果:"+ee.getTitle());
			}
		}
		@SuppressWarnings("unchecked")
		List<EDoc_Entry> eeList = HibernateSessionFactory.getSession().createQuery("from EDoc_Entry ee where ee.docCategory.id = "+id).list();
		for(EDoc_Entry ee:eeList) {
			
			System.out.println("结果:"+ee.getSummary());
			
		}
		infosList = eeList;
		CategorysList = ecList;
		Map<String,Object> maps = new HashMap<String,Object>();
		maps.put("info", infosList);
		maps.put("cate",CategorysList);
		
		return maps;
	}
	/////
	
	public Map<String, Object> listAll() {
		@SuppressWarnings("unchecked")
		List<EDoc_Category> ecList = HibernateSessionFactory.getSession().createQuery("from EDoc_Category").list();
		for(EDoc_Category ec:ecList) {
			
			
				System.out.println("listAll结果:"+ec.getName());
			
		}
		Map<String,Object> listAllmaps = new HashMap<String,Object>();
		CategorysList = ecList;
		//
		listAllmaps.put("cate",CategorysList);
		//
		
		return listAllmaps;
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
