package Homework3NLayerApp;

import Homework3NLayerApp.business.KursManager;
import Homework3NLayerApp.core.Logging.DatabaseLogger;
import Homework3NLayerApp.core.Logging.FileLogger;
import Homework3NLayerApp.core.Logging.Logger;
import Homework3NLayerApp.dataAccess.JdbcEntityDao;
import Homework3NLayerApp.entities.Kurs;

public class Main {

	public static void main(String[] args) throws Exception {
		Kurs kurs1=new Kurs(1,"Java",10);
		Kurs kurs2=new Kurs(2,"Java",10);
		
		Logger[] loggers= {new DatabaseLogger(),new FileLogger()};
		
		KursManager kursManager=new KursManager(new JdbcEntityDao(),loggers);
		kursManager.add(kurs1);
		kursManager.add(kurs2);
	}

}
