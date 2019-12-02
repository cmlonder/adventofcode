package com.cemalonder.adventofcode.days.day1.solarSystem;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class FuelCalculator {

  public static Integer calculateMass(List<Module> modules) {
    return modules.stream()
        .map(module -> calculateMass().apply(module.getMass(), 0))
        .reduce(0, Integer::sum);
  }

  public static Integer calculate(List<Module> modules) {
    return modules.stream()
        .map(module -> calculate().apply(module.getMass()))
        .reduce(0, Integer::sum);
  }

  private static BiFunction<Integer, Integer, Integer> calculateMass() {
    return (cost, totalCost) -> {
      final Integer currentCost = calculate().apply(cost);

      if (currentCost > 0) {
        totalCost = totalCost + currentCost;
        return calculateMass().apply(currentCost, totalCost);
      }

      return totalCost;
    };
  }

  private static Function<Integer, Integer> calculate() {
    return cost ->
        Stream.of(cost)
            .map(currentCost -> divideBy(3).apply(cost))
            .map(currentCost -> subtract(2).apply(currentCost))
            .findFirst()
            .orElse(0);
  }

  private static Function<Integer, Integer> divideBy(Integer size) {
    return value -> value / size;
  }

  private static Function<Integer, Integer> subtract(Integer size) {
    return value -> value - size;
  }
}
