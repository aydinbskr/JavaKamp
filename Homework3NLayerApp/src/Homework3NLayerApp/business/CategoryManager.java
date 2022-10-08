package Homework3NLayerApp.business;

import java.util.ArrayList;
import java.util.List;

import Homework3NLayerApp.core.Logging.Logger;
import Homework3NLayerApp.dataAccess.EntityDao;
import Homework3NLayerApp.entities.Category;


public class CategoryManager {
	private EntityDao entityDao;
	private Logger[] loggers;
	private List<Category> categories= new ArrayList<>();
	
	public CategoryManager(EntityDao entityDao,Logger[] loggers) {
		
		this.entityDao = entityDao;
		this.loggers=loggers;
	}

	public void add(Category category) throws Exception
	{
		
		if(isNameAdded(category.getName()))
		{
			throw new Exception("Kategori ismi tekrar edemez");
		}
		categories.add(category);
		entityDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
	 private Boolean isNameAdded(String name)
	 {
		 for (Category category : categories) {
			  if(name.equals(category.getName()))
			  {
				  return true;
			  }
		  }
		 
		 return false;
	 }
}
