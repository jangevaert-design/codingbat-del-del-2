public class DelDel2 {
  public String delDel(String str) {
    if (str.length() <= 3) {
      return str;
    }
    if (str.startsWith("del", 1)) {
      return str.charAt(0) + str.substring(4, str.length());
    } else {
      return str;
    }
  }
}

/*
 better to use startsWith with an int as start as above
public class DelDel2 {
  public String delDel(String str) {
    if (str.length() <= 3) {
      return str;
    }
    if (str.substring(1, 4). equals("del")) {
      return str.charAt(0) + str.substring(4, str.length());
    } else {
      return str;
    }
  }
}
*/
