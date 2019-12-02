package com.cemalonder.adventofcode.days.day1.solarSystem;

import javax.validation.constraints.Min;

public class Module {

  @Min(value = 0, message = "Invalid mass: ${validatedValue}, should be at least {value}")
  private Integer mass;

  public Module(Integer mass) {
    this.mass = mass;
  }

  public Integer getMass() {
    return mass;
  }
}
