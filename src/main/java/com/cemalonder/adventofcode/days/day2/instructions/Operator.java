package com.cemalonder.adventofcode.days.day2.instructions;

import java.util.List;

public interface Operator {

  void doOperation(List<Integer> instructions, Integer currentPosition,
      OperatorChain operatorChain);
}
