package testPack;

import java.util.List;
import java.util.Set;

import entity.EDoc_Category;
import entity.EDoc_Entry;
import util.HibernateSessionFactory;

public class TestHS {
	
	public static void main(String[] args) {
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
	}
	
	
	
}
