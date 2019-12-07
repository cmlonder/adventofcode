package com.cemalonder.adventofcode.days.day2;

import com.cemalonder.adventofcode.days.day2.instructions.InstructionChain;
import java.util.List;
import java.util.Objects;

public class Day2 {

  public List<Integer> calculate(List<Integer> instructions) {
    Objects.requireNonNull(instructions, "instructions can not be null");
    instructions.set(1, 12);
    instructions.set(2, 2);
    final InstructionChain instructionChain = new InstructionChain();
    final Integer startingPosition = 0;
    instructionChain.handle(instructions, startingPosition);
    return instructions;
  }
}
