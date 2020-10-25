package com.igreendata.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages= {"com.igreendata.test.jpa.repository"})
public class ContextWithJavaConfig {

}
