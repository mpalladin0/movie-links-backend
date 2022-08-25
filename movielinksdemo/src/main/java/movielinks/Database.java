package movielinks;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Session;
import org.neo4j.driver.SessionConfig;

public class Database {
    public Database() {
        System.out.println("Database initialized");
    }

    /**
     * neo4j databsae driver, needed to actually request data from the databsae
     * !!!! After use, make sure you call driver.close() to close the connection!!!
     * 
     * @return Driver
     */
    private Driver getDriver() {
        return GraphDatabase.driver("bolt://3.82.173.195:7687", AuthTokens.basic("neo4j", "lead-september-controls"));
    }

    public Session getSession() {
        try {
            return this.getDriver().session(SessionConfig.forDatabase("neo4j"));
        } catch (Error e) {
            throw e;
        }
    }

}