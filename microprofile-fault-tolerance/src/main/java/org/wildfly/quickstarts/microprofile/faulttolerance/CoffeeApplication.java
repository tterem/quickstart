package org.wildfly.quickstarts.microprofile.faulttolerance;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/service")
public class CoffeeApplication extends Application {
}
