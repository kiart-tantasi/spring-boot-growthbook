package net.petchblog.growthbook.controllers;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Timestamp;
import net.petchblog.growthbook.entities.Purchase;
import net.petchblog.growthbook.services.GBService;
import net.petchblog.growthbook.services.PurchaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/exp")
public class ExperimentController {

  private final GBService gbService;
  private final PurchaseService purchaseService;

  public ExperimentController(GBService gbService, PurchaseService purchaseService) {
    this.gbService = gbService;
    this.purchaseService = purchaseService;
  }

  @GetMapping("{expKey}/id/{id}")
  public ResponseEntity<?> getFirstExp(@PathVariable String expKey, @PathVariable String id)
      throws URISyntaxException, IOException, InterruptedException {
    System.out.println("==================================================");
    final boolean isOn = gbService.isOn(id, expKey);
    System.out.println("isOn: " + isOn);
    return ResponseEntity.ok().body(isOn);
  }

  @PostMapping("first-exp/purchase/id/{id}")
  public ResponseEntity<?> postPurchase(@PathVariable String id) {
    this.purchaseService.insertPurchase(
        new Purchase(id, new Timestamp(System.currentTimeMillis())));
    return ResponseEntity.ok().build();
  }
}
