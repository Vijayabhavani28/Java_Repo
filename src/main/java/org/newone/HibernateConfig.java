package org.newone;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;
import java.util.Properties;

public class HibernateConfig {
    public static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            try{
                Configuration configuration = new Configuration();
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL,"jdbc:mysql://localhost:3306/practice?useSSL=false");
                settings.put(Environment.USER,"root");
                settings.put(Environment.PASS,"Vijju@2807");
                settings.put(Environment.SHOW_SQL,"true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                settings.put(Environment.HBM2DDL_AUTO,"update");
                configuration.set(properties(settings));

                configuration.addAnnotateClass()


                }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
