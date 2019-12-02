package com.cemalonder.adventofcode.days.day1;

import com.cemalonder.adventofcode.days.day1.solarSystem.FuelCalculator;
import com.cemalonder.adventofcode.days.day1.solarSystem.Module;
import java.util.List;
import java.util.Objects;

public class Day1 {

  public Integer calculate(List<Module> modules) {
    Objects.requireNonNull(modules, "modules can not be null");
    return FuelCalculator.calculate(modules);
  }

  public Integer calculateMass(List<Module> modules) {
    Objects.requireNonNull(modules, "modules can not be null");
    return FuelCalculator.calculateMass(modules);
  }
}
