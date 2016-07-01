public class Detyra_7_7_2
{
public String removeDuplicateLetters(String s)
{ String answer = "";
  for ( int i = 0;  i != s.length();  i = i + 1 )
       { if ( karakteri(answer, s.charAt(i)) )
            { answer = answer + s.charAt(i); }
       }
  return answer;
}
private boolean karakteri(String a, char c)
{ boolean k = true;
  for ( int j = 0;  j != a.length();  j = j + 1 )
      { k = k  &&  (c != a.charAt(j)); }
  return k;
}
public static void main(String[] args)
{
 Detyra_7_7_2 c = new Detyra_7_7_2();
 
 System.out.println(c.removeDuplicateLetters("butterflies"));
}
}