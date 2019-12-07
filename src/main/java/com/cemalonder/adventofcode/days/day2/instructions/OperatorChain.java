package com.cemalonder.adventofcode.days.day2.instructions;

import java.util.List;

public interface OperatorChain {

  void handle(List<Integer> instructions, Integer currentPosition);
}
