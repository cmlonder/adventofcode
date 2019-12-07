package com.cemalonder.adventofcode.days.day2.instructions;

public class OpCodeFactory {

  public static Operator create(Integer opCode) {
    switch (opCode) {
      case 1:
        return new Add();
      case 2:
        return new Multiply();
      case 99:
        return new Halt();
      default:
        throw new IllegalStateException("Opcode can not be recognized.");
    }
  }
}
