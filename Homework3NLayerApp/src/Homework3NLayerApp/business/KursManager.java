package Homework3NLayerApp.business;

import java.util.ArrayList;
import java.util.List;

import Homework3NLayerApp.core.Logging.Logger;
import Homework3NLayerApp.dataAccess.EntityDao;
import Homework3NLayerApp.entities.Kurs;

public class KursManager {
	private EntityDao entityDao;
	private Logger[] loggers;
	private List<Kurs> courses= new ArrayList<>();
	
	public KursManager(EntityDao entityDao,Logger[] loggers) {
		
		this.entityDao = entityDao;
		this.loggers=loggers;
	}

	public void add(Kurs kurs) throws Exception
	{
		if(isNameAdded(kurs.getName()))
		{
			throw new Exception("Kurs ismi tekrar edemez");
		}
		courses.add(kurs);
		entityDao.add(kurs);
		
		for (Logger logger : loggers) {
			logger.log(kurs.getName());
		}
	}
	private Boolean isNameAdded(String name)
	 {
		 for (Kurs kurs : courses) {
			  if(name.equals(kurs.getName()))
			  {
				  return true;
			  }
		  }
		 
		 return false;
	 }
}
