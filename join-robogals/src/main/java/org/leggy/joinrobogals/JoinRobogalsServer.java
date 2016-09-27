package org.leggy.joinrobogals;

import org.leggy.joinrobogals.resources.JoinResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class JoinRobogalsServer extends Application<JoinRobogalsConfiguration> {
	
    public static void main(String[] args) throws Exception {
        new JoinRobogalsServer().run(args);
    }

    @Override
    public String getName() {
        return "joinrobogals";
    }

    @Override
    public void initialize(Bootstrap<JoinRobogalsConfiguration> bootstrap) {
    }

    @Override
    public void run(JoinRobogalsConfiguration configuration,
                    Environment environment) {
        environment.jersey().register(new JoinResource());
    }

}