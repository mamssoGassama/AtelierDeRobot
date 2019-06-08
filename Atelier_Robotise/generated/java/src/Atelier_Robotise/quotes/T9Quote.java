package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class T9Quote {
  private static int hc = 0;
  private static T9Quote instance = null;

  public T9Quote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static T9Quote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new T9Quote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof T9Quote;
  }

  public String toString() {

    return "<T9>";
  }
}
