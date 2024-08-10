import java.util.*;
public class rec_string
{
    public static void main(String[] args)
    {
//    skip("","abhaac");
//        System.out.println(skip("abhaavca"));
        System.out.println(skipapple("acvappleubfa"));
    }
//   static void skip(String p,String up)//taking processed and unprocessed string for removal
//   {
//     if(up.isEmpty()){
//         System.out.println(p);//when unprocessed string is empty we output processed string
//         return;
//     }
//  char ch=up.charAt(0);
//  if(ch=='a'){skip(p,up.substring(1));} //this here creates new string from next character
//  else{
//      skip(p+ch,up.substring(1));
//  }
//       static String skip(String up)//while returning string we only take unprocesed and return string unlike prvious manipulation
//       {
//           if(up.isEmpty()){
//               return "";
//           }
//           char ch=up.charAt(0);
//           if(ch=='a'){return skip(up.substring(1));} //this here creates new string from next character
//           else{
//              return ch+ skip(up.substring(1));
//           }
//   }
    static String skipapple(String up)//while returning string we only take unprocesed and return string unlike prvious manipulation
    {
        if(up.isEmpty())
        {
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple")){return skipapple(up.substring(5));} //this here creates new string from next character
        else{
            return ch+ skipapple(up.substring(1));
        }
    }
}

