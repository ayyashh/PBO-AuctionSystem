public class AuctionTest {
    public static void main (String[] arg) {
	Person olle = new Person("Olle");
	Person kalle = new Person("Kalle");

	Auction a = new Auction ();

	a.enterLot("Mona Lisa");

	a.enterLot("A painting of a moose");

	System.out.println("Lots...");

	a.showLots();

	a.bidFor(2, olle, 5);
	a.bidFor(2, kalle, 10);
	a.bidFor(2, olle, 8);
	a.bidFor(2, olle, 15);

	a.showLots();

	a.bidFor(1, olle, 1000000);
	a.bidFor(1, kalle, 2000000);

	a.showLots();
    }
}