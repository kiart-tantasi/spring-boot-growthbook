package net.petchblog.growthbook.entities;


import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
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
  @SuppressFBWarnings("URF_UNREAD_FIELD")
  private Timestamp timestamp;

  public Purchase() {
  }

  public Purchase(String userId, Timestamp timestamp) {
    this.userId = userId;
    this.timestamp = timestamp;
  }
}
