package com.linkpets.monitor.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class MonitorAdminServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorAdminServiceApplication.class, args);
    }

}
