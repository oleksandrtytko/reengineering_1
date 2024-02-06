package com.refactor;

import java.util.function.Function;

public enum HumanImb {

  NORM(imb -> imb >= HumanImb.NORM_THRESHOLD && imb < HumanImb.WARN_THRESHOLD, "Norm"),
  WARNING(imb -> imb >= HumanImb.WARN_THRESHOLD && imb < HumanImb.FAT_THRESHOLD,
      "Warning! "),
  FAT(imb -> imb >= HumanImb.FAT_THRESHOLD, "Fat"),
  DEFICIT(imb -> imb < HumanImb.NORM_THRESHOLD, "Deficit");

  private final static double NORM_THRESHOLD = 18.5;
  private final static double WARN_THRESHOLD = 25;
  private final static double FAT_THRESHOLD = 30;

  private final Function<Double, Boolean> checkFunction;
  private final String value;

  HumanImb(Function<Double, Boolean> checkFunction, String value) {
    this.checkFunction = checkFunction;
    this.value = value;
  }

  public Function<Double, Boolean> getCheckFunction() {
    return checkFunction;
  }

  public String getValue() {
    return value;
  }
}
