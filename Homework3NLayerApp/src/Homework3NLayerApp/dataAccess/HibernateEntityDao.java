package Homework3NLayerApp.dataAccess;

import Homework3NLayerApp.entities.Entity;

public class HibernateEntityDao implements EntityDao {
	public void add(Entity entity)
    {
    	System.out.println("Hibernate ile veri tabanına eklendi");
    }
}
