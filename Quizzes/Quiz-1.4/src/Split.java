public class Split {

    /**
    * Create a String named 'ret' and get the first letter of 
    * each word inside the string.
    * Use String.split() and String.charAt() methods.
    * Find detailed API documentation at the website listed above.
    */ 
    public String split() {
      String tester = new String("Idol Long Oolong Vertical Europe University Toyota");
      String[] splitWords = tester.split(" ");
      StringBuilder sb = new StringBuilder();
      for (String word : splitWords) {
          char c = word.charAt(0);
          sb.append(c);
      }
      String ret = sb.toString();
      return ret;
    }
}