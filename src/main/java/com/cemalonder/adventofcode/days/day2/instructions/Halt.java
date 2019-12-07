package com.cemalonder.adventofcode.days.day2.instructions;

import java.util.List;

public class Halt implements Operator {

  @Override
  public void doOperation(List<Integer> instructions, Integer currentPosition,
      OperatorChain operatorChain) {
    currentPosition = currentPosition + 1;
    operatorChain.handle(instructions, currentPosition);
  }
}