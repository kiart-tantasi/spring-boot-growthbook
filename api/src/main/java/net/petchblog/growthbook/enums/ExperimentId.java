package net.petchblog.growthbook.enums;

import lombok.Getter;

@Getter
public enum ExperimentId {
  FIRST_EXP("first-exp");

  // to attach custom values
  private final String value;

  ExperimentId(String value) {
    this.value = value;
  }
}
