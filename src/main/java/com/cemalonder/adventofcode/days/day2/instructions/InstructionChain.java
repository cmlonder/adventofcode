package com.cemalonder.adventofcode.days.day2.instructions;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstructionChain implements OperatorChain {

  private static final Logger LOGGER = LoggerFactory.getLogger(InstructionChain.class);

  @Override
  public void handle(List<Integer> instructions, Integer currentPosition) {
    if (currentPosition == instructions.size() + 1) {
      LOGGER.debug("Reached end of the chain.");
    }

    final Operator nextOperator = OpCodeFactory.create(instructions.get(currentPosition));

    if (nextOperator instanceof Halt) {
      LOGGER.debug("Program halted.");
      return;
    }

    LOGGER.debug("Chaining next operator: {}", nextOperator.getClass().getSimpleName());
    nextOperator.doOperation(instructions, currentPosition, this);
  }
}
