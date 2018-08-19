package com.tcs.mmisamples.customerprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by SSasidharan on 2016/12/14.
 * Bootstrap class for Spring boot.
 *
 *
 */

@EnableJpaRepositories
@SpringBootApplication
public class CustomerProfileApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CustomerProfileApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CustomerProfileApplication.class, args);
    }
}
