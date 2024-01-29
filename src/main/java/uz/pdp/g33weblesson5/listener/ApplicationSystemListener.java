package uz.pdp.g33weblesson5.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class ApplicationSystemListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //mailing developers
        System.out.println("::::::::::::::::::::::::::APPLICATION STARTED::::::::::::::::::::::::::::::::::::");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //mailing developers
        System.out.println("::::::::::::::::::::::::::APPLICATION STOPPED::::::::::::::::::::::::::::::::::::");
    }
}
