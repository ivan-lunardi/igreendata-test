package com.igreendata.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;

@EntityScan(basePackages={"com.igreendata.test.data"})
@ImportResource(locations={"classpath:camel/rest-api-*.xml"})
@SpringBootApplication
public class IgreendataTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(IgreendataTestApplication.class, args);
  }

}
