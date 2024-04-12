package net.petchblog.growthbook.services;

import net.petchblog.growthbook.entities.Purchase;
import net.petchblog.growthbook.repositories.PurchaseRepository;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {
  private final PurchaseRepository purchaseRepository;

  public PurchaseService(PurchaseRepository purchaseRepository) {
    this.purchaseRepository = purchaseRepository;
  }

  public void insertPurchase(Purchase purchase) {
    this.purchaseRepository.save(purchase);
  }
}
