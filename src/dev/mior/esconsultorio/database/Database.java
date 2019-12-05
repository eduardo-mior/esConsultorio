package dev.mior.esconsultorio.database;

import dev.mior.esconsultorio.dao.EntityDAO;
import java.util.Properties;
import javax.persistence.Persistence;

/**
 *
 * @author Mior
 */
public final class Database {
    
    public static void init() throws Throwable {
        
        // Informações de criação do banco de dados
        String host = "localhost";
        String db = "esconsultorio";
        String user = "dentista__user";
        String password = "@ASF#azz356!MEIBE..deff..k77-pg_default";
        String path = "jdbc:postgresql://" + host + "/" + db;
        String driver = "org.postgresql.Driver";
        String schema = "create";
                          
        // Criando e definindo as propriedades da PU
        Properties properties = new Properties();
        properties.setProperty("javax.persistence.jdbc.user", user);
        properties.setProperty("javax.persistence.jdbc.password", password);
        properties.setProperty("javax.persistence.jdbc.url", path);
        properties.setProperty("javax.persistence.jdbc.driver", driver);
        properties.setProperty("javax.persistence.schema-generation.database.action", schema);

        // Criando a PU
        EntityDAO.EMF = Persistence.createEntityManagerFactory("esConsultorioPU", properties);
    }
    
}