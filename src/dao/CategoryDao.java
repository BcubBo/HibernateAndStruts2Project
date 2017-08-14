package dao;

import java.util.List;

public interface CategoryDao<T> {
	public List<T> save();
	public List<T> update();
}
