public class Reservation {
  int ticketid;
    Reservation(int ticketid)
    {
        this.ticketid =ticketid;
    }
public void showTicket()
{
System.out.println("this shows ticketnumber");
}
public static void main(String[] args)
{
  Reservation r= new Reservation(31175);
  System.out.println("Reservation Id :" + r.ticketid);
  r.showTicket();
}
}
