package dao;

import java.util.List;

public interface EntryDao<T> {
	public List<T> save();
	public List<T> update();
}
