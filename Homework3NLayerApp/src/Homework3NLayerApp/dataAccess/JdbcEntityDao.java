package Homework3NLayerApp.dataAccess;

import Homework3NLayerApp.entities.Entity;

public class JdbcEntityDao implements EntityDao {
	public void add(Entity entity)
    {
    	System.out.println("JDBC ile veri tabanına eklendi");
    }
}
