package Homework3NLayerApp.business;

import Homework3NLayerApp.core.Logging.Logger;
import Homework3NLayerApp.dataAccess.EntityDao;
import Homework3NLayerApp.entities.Egitmen;

class EgitmenManager {
	private EntityDao entityDao;
	private Logger[] loggers;
	
	public EgitmenManager(EntityDao entityDao,Logger[] loggers) {
		
		this.entityDao = entityDao;
		this.loggers=loggers;
	}

	public void add(Egitmen egitmen) throws Exception
	{
		
		entityDao.add(egitmen);
		
		for (Logger logger : loggers) {
			logger.log(egitmen.getName());
		}
	}
}
