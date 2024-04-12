package net.petchblog.growthbook.configurations;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class GBConfig {
  @Value("${growthbook.endpoint}")
  private String endpoint;
}
