package net.petchblog.growthbook.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;

@Table
@Entity
public class Purchase {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "user_id")
  private String userId;
  private Timestamp timestamp;

  public Purchase() {
  }

  public Purchase(String userId, Timestamp timestamp) {
    this.userId = userId;
    this.timestamp = timestamp;
  }
}
