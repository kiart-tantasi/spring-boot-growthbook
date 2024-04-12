package net.petchblog.growthbook.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table
public class Assignment {
  @Id
  // IDENTITY vs SEQUENCE - https://stackoverflow.com/q/10062328/21331113
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "user_id")
  private String userId;
  private Timestamp timestamp;
  @Column(name = "experiment_id")
  private String experimentId;
  @Column(name = "variation_id")
  private String variationId;

  public Assignment() {
  }

  public Assignment(String userId, Timestamp timestamp, String experimentId, String variationId) {
    this.userId = userId;
    this.timestamp = timestamp;
    this.experimentId = experimentId;
    this.variationId = variationId;
  }
}
