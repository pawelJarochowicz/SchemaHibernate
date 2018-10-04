package nba.schema.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreatingDb {

    public static void main(String[] args) {
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory=configuration.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        /*
        ***INSERT VALUES INTO TABLES***
        Team team=new Team();
        team.setTeam_id(1);
        team.setName("Denver Nuggets");
        team.setCity("Denver");
        team.setState("Colorado");
        team.setShort_name("DEN");
        session.merge(team);
         */
        transaction.commit();
        session.close();
        System.out.println("Saving successfully");
    }
}
