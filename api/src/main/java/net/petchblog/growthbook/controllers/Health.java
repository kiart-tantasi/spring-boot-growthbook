package net.petchblog.growthbook.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class Health {
  @GetMapping
  public ResponseEntity<?> health() throws InterruptedException {
    Thread.sleep(200); // fake response time
    return ResponseEntity.ok().build();
  }
}
