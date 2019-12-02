package com.cemalonder.adventofcode.days.day1;

import com.cemalonder.adventofcode.days.day1.solarSystem.Module;
import com.cemalonder.adventofcode.days.day1.solarSystem.ModuleValidator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Day1Runner {

  private static final Logger logger = LoggerFactory.getLogger(Day1Runner.class);

  private Day1Runner() {
  }

  public static void run() {
    final List<Module> modules = readModules();
    part1(modules);
    part2(modules);
  }

  private static void part1(List<Module> modules) {
    final Day1 day1 = new Day1();
    final Integer cost = day1.calculate(modules);
    logger.info("{}: Cost: {}", day1.getClass().getSimpleName(), cost);
  }

  private static void part2(List<Module> modules) {
    final Day1 day1 = new Day1();
    final Integer massCost = day1.calculateMass(modules);
    logger.info("{}: MassCost: {}", day1.getClass().getSimpleName(), massCost);
  }

  private static List<Module> readModules() {
    final String file = "./days/day1/input.txt";
    final InputStream inputFile = Day1Runner.class.getClassLoader().getResourceAsStream(file);
    final List<Module> modules = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputFile))) {
      String currentLine = reader.readLine();
      while (currentLine != null) {
        final Integer mass = Integer.valueOf(currentLine);
        final Module module = new Module(mass);
        ModuleValidator.validate(module);
        modules.add(module);
        currentLine = reader.readLine();
      }

    } catch (IOException e) {
      logger.debug("Can not read file:", e);
    }

    return modules;
  }
}
