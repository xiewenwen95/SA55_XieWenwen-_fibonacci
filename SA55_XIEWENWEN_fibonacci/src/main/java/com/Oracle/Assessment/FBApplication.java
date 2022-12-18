package com.Oracle.Assessment;

import com.Oracle.Assessment.resources.FBResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class FBApplication extends Application<FBConfiguration> {
    public static void main(String[] args) throws Exception {
        new FBApplication().run(args);
    }

    @Override
    public String getName() {
        return "fibonacci";
    }

    @Override
    public void initialize(Bootstrap<FBConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(FBConfiguration configuration,
                    Environment environment) {
        final FBResource resource = new FBResource(
                configuration.getDefaultElementNum()
        );
        environment.jersey().register(resource);
    }

}
