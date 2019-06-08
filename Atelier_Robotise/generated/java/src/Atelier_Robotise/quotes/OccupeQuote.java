package Atelier_Robotise.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class OccupeQuote {
  private static int hc = 0;
  private static OccupeQuote instance = null;

  public OccupeQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static OccupeQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new OccupeQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof OccupeQuote;
  }

  public String toString() {

    return "<Occupe>";
  }
}
