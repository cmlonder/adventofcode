package com.cemalonder.adventofcode.days.day2.instructions;

import java.util.List;

public abstract class AbstractOperator implements Operator {

  @Override
  public void doOperation(List<Integer> instructions, Integer currentPosition,
      OperatorChain operatorChain) {
    final Integer firstIndex = instructions.get(currentPosition + 1);
    final Integer firstOperand = instructions.get(firstIndex);

    final Integer secondIndex = instructions.get(currentPosition + 2);
    final Integer secondOperand = instructions.get(secondIndex);

    final Integer result = operate(firstOperand, secondOperand);
    final int resultIndex = instructions.get(currentPosition + 3);
    instructions.set(resultIndex, result);

    currentPosition = currentPosition + 4;

    operatorChain.handle(instructions, currentPosition);
  }

  abstract Integer operate(Integer firstOperand, Integer secondOperand);
}
