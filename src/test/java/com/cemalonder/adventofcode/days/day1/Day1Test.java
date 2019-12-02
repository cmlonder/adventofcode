package com.cemalonder.adventofcode.days.day1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import com.cemalonder.adventofcode.days.day1.solarSystem.Module;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Day1Test {

  private Day1 day1;

  @BeforeEach
  void setUp() {
    day1 = new Day1();
  }

  @Test
  void calculate_nullModules_shouldThrowException() {
    try {
      day1.calculate(null);
      fail("Expected to receive exception, but not received");
    } catch (NullPointerException ex) {
      // expected
    }
  }

  @Test
  void calculate_emptyModules_shouldReturnZeroCost() {
    final List<Module> modules = new ArrayList<>();
    final Integer sum = day1.calculate(modules);
    assertThat(sum).isZero();
  }

  @Test
  void calculate_givenModules_shouldReturnExpectedCost() {
    final List<Module> modules = new ArrayList<>();
    modules.add(new Module(10));
    modules.add(new Module(100));
    final Integer expectedSum = (10 / 3) - 2 + (100 / 3) - 2;
    final Integer sum = day1.calculate(modules);
    assertThat(sum).isEqualTo(expectedSum);
  }

  @Test
  void calculateMass_nullModules_shouldThrowException() {
    try {
      day1.calculateMass(null);
      fail("Expected to receive exception, but not received");
    } catch (NullPointerException ex) {
      // expected
    }
  }

  @Test
  void calculateMass_emptyModules_shouldReturnZeroCost() {
    final List<Module> modules = new ArrayList<>();
    final Integer sum = day1.calculateMass(modules);
    assertThat(sum).isZero();
  }

  @Test
  void calculateMass_givenModules_shouldReturnExpectedCost() {
    final List<Module> modules = new ArrayList<>();
    modules.add(new Module(-10));
    modules.add(new Module(100));
    final Integer expectedSum = (10 / 3) - 2 + (100 / 3) - 2 + (31 / 3) - 2 + (8 / 3) - 2;
    final Integer sum = day1.calculateMass(modules);
    assertThat(sum).isEqualTo(expectedSum);
  }

}