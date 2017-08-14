package daoIMPL;

import java.util.List;

import org.hibernate.Session;

import dao.CategoryDao;
import entity.EDoc_Category;
import util.HibernateSessionFactory;

public class CategoryDaoImpl implements CategoryDao<EDoc_Category> {
	Session  session = HibernateSessionFactory.getSession();
	@Override
	public List<EDoc_Category> save() {
		
		
		return null;
	}

	@Override
	public List<EDoc_Category> update() {
		return null;
	}

}
