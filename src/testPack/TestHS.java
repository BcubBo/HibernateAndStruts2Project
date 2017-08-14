package testPack;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.EDoc_Category;
import entity.EDoc_Entry;
import util.HibernateSessionFactory;

public class TestHS {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction ts = session.getTransaction();
		Logger logger = (Logger)LogManager.getLogger();
		@SuppressWarnings("unchecked")
		List<EDoc_Category> ecList = HibernateSessionFactory.getSession().createQuery("from EDoc_Category ec where ec.id = 1").list();
		for(EDoc_Category ec:ecList) {
			Set<EDoc_Entry> enSet = ec.getDocEntrys();
			for(EDoc_Entry ee:enSet) {
				System.out.println("结果:"+ee.getTitle());
			}
		}
		@SuppressWarnings("unchecked")
		List<String> eeList = HibernateSessionFactory.getSession().createQuery("select ee.docCategory.name from EDoc_Entry ee where ee.docCategory.id = 1").list();
		for(String ee:eeList) {
			
			System.out.println("结果:"+ee);
			
		}

		try {
			
			ts.begin();
			EDoc_Entry ee1 = new EDoc_Entry();
			Set<EDoc_Entry> eeSet = new HashSet<EDoc_Entry>();
			ee1.setCategoryid(1);
			ee1.setCreatedate(new Date());
			ee1.setTitle("testTitle");
			eeSet.add(ee1);
			EDoc_Category ec1 = new EDoc_Category();
			ec1.setDocEntrys(eeSet);
			ec1.setName("test1");
			ee1.setDocCategory(ec1);
			logger.debug(session.save(ec1));
			
			ts.commit();
			
			
			
		}catch(Exception e) {
			if(session!=null) {
				
				ts.rollback();
				
				
			}
			
			e.printStackTrace();
		}
		
	}
	
	
	
}
