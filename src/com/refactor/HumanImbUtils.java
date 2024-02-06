package com.refactor;

import java.util.Arrays;

public class HumanImbUtils {

  private static double getImb(double humanWeight, double humanHeight) {
    return humanWeight / (humanHeight * humanHeight);
  }

  private static HumanImb getResultUsingImb(double imb) {
    return Arrays.stream(HumanImb.values())
        .filter(state -> state.getCheckFunction().apply(imb))
        .findAny()
        .orElse(null);
  }

  public static HumanImb getResult(double humanWeight, double humanHeight) {
    return getResultUsingImb(getImb(humanWeight, humanHeight));
  }
}
