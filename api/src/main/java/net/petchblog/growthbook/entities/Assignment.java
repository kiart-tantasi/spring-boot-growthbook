package net.petchblog.growthbook.entities;

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
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String user_id;
  private Timestamp timestamp;
  private String experiment_id;
  private String variation_id;

  public Assignment() {
  }

  public Assignment(String user_id, Timestamp timestamp, String experimentId, String variationId) {
    this.user_id = user_id;
    this.timestamp = timestamp;
    this.experiment_id = experimentId;
    this.variation_id = variationId;
  }
}
