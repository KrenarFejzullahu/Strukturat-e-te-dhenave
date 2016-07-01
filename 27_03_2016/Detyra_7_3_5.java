public class Detyra_7_3_5
{
 public int summation(int n)
{ int total = 0;  
  int count = 0;  
  while ( count != n )
        { count = count + 1;
          total = total + count;
        }
          return total;
}
public int product(int a, int b)
{ int total = 1;
  if ( a <= b )
     { total = a; 
       int count = a;
       while ( count != b )
             { count = count + 1;
               total = total * count;
             }
     }
  return total;
}
public long factorial(int n)
{ long fac = -1;
  if ( n >= 0  &&  n <= 20 )
     { int count = 0;  fac = 1;
       while ( count != n )
             { count = count + 1;
               fac = fac * count;
             }
     }
  return fac;
}

public double sine(double x)
{ double sin = x;
  int count = 3;
  while ( count <= 19 )
        
        { double d = Math.pow(x, count) / factorial(count); 
          if ( (count % 4) == 3 )
               { sin = sin - d; }
          else { sin = sin + d; }
          count = count + 2;
        }
  /** int i = 0;
  double sin 0;
  while (i<20)
  {
   int n = 2*i+1;
   sin = sin + Math.pow(-1,i)*Math.pow(x,n)/factoriel(n);
   i++
  }*/
  return sin;
}

public double cosine(double x)
{
 double cos = 1;
 int count = 2;
 while(count <= 20)
 {
  double d = Math.pow(x,count)/factorial(count);
  if((count % 4) == 2)
  {
   cos = cos - d;
  }
  else {cos = cos +d;}
  count = count+2;
 }
 return cos;
 }
 
 
 
 public static void main(String[] args)
 {
  Detyra_7_3_5 a = new Detyra_7_3_5();
  
  System.out.println(a.summation(4));
  System.out.println(a.product(6,8));
  System.out.println(a.factorial(7));
  System.out.println(a.sine(Math.PI/2));
  System.out.println(a.cosine(0));
 }
 
}