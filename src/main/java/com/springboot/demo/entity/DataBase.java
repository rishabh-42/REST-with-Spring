package entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataBase {

  @Value("${database.name}")
  private String name;

  @Value("${database.port}")
  private int port;

  public String getName() {
    return name;
  }

  public int getPort() {
    return port;
  }
}
