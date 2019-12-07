package com.cemalonder.adventofcode.days.day2.instructions;

public class Multiply extends AbstractOperator {

  @Override
  public Integer operate(Integer firstOperand, Integer secondOperand) {
    return firstOperand * secondOperand;
  }
}
