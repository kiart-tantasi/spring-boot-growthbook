package net.petchblog.growthbook.controllers;

import java.io.IOException;
import java.net.URISyntaxException;
import net.petchblog.growthbook.enums.ExperimentId;
import net.petchblog.growthbook.services.GBService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/exp")
public class ExperimentController {

  private final GBService gbService;

  public ExperimentController(GBService gbService) {
    this.gbService = gbService;
  }

  // curl -I http://localhost:8080/api/exp/first-exp/id/3
  @GetMapping("first-exp/id/{id}")
  public ResponseEntity<?> getFirstExp(@PathVariable String id)
      throws URISyntaxException, IOException, InterruptedException {
    System.out.println("==================================================");
    final boolean isOn = gbService.isOn(id, ExperimentId.FIRST_EXP);
    System.out.println("isOn: " + isOn);
    System.out.println("==================================================");
    return ResponseEntity.ok().body(isOn);
  }
}
