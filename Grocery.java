public class Grocery
{
 int weight ;

 public void weightNow()
{
 System.out.println("the weight is :" +100);
}
public void checkWeight()
{
 System.out.println("this checks the weight of groceries");
}
public static void main(String[] args)
{
Grocery g = new Grocery();
  g.checkWeight();
  g.weightNow();
}
}
