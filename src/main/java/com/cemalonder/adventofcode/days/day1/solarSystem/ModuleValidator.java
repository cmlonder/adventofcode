package com.cemalonder.adventofcode.days.day1.solarSystem;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModuleValidator {

  private static final Logger logger = LoggerFactory.getLogger(ModuleValidator.class);

  public static void validate(Module module) {
    final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    final Validator validator = factory.getValidator();
    final Set<ConstraintViolation<Module>> violations = validator.validate(module);
    for (ConstraintViolation<Module> violation : violations) {
      logger.error(violation.getMessage());
    }
  }
}
