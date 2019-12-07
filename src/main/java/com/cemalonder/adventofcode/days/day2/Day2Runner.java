package com.cemalonder.adventofcode.days.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Day2Runner {

  private static final Logger logger = LoggerFactory.getLogger(Day2Runner.class);

  private Day2Runner() {
  }

  public static void run() {
    final List<Integer> intCodes = readIntCodes();
    part1(intCodes);
  }

  private static void part1(List<Integer> intCodes) {
    final Day2 day2 = new Day2();
    final List<Integer> cost = day2.calculate(intCodes);
    logger.info("{} - Instructions: {}", day2.getClass().getSimpleName(), cost);
  }

  private static List<Integer> readIntCodes() {
    final String file = "./days/day2-input.txt";
    final InputStream inputFile = Day2Runner.class.getClassLoader().getResourceAsStream(file);
    List<Integer> intCodes = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputFile))) {
      String currentLine = reader.readLine();
      while (currentLine != null) {
        intCodes = Arrays.stream(currentLine.split(","))
            .map(Integer::valueOf)
            .collect(Collectors.toList());
        currentLine = reader.readLine();
      }

    } catch (IOException e) {
      logger.debug("Can not read file:", e);
    }

    return intCodes;
  }
}
