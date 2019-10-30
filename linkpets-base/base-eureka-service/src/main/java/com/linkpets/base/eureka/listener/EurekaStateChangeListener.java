package com.linkpets.base.eureka.listener;

import com.netflix.appinfo.InstanceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author Edie
 */
@Component
public class EurekaStateChangeListener {

    private static final Logger log = LoggerFactory.getLogger(EurekaStateChangeListener.class);

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        log.info(event.getServerId() + "-" + event.getAppName() + ":offLine.");
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        log.info(instanceInfo.getAppName() + ":registering.");
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        log.info(event.getServerId() + "-" + event.getAppName() + ":service renewed.");
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        log.info("Registry start.");
    }

    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        log.info("Eureka Server start.");
    }
}
