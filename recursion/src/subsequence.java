import java.util.*;
public class subsequence
{
    public static void main(String[] args)
    {
    subseq("","abc");
    }
    static void subseq(String p,String up)
    {
      if(up.isEmpty())
      {
          System.out.println(p);
          return;
      }
      char ch=up.charAt(0);
        subseq(p+ch,up.substring(1)); //consdition of taking the character
      subseq(p,up.substring(1));
    }
}
