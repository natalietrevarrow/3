public class Main
{
	public static void main(String[] args) {
		Salesman blade = new Salesman("Blade", 101);
		Salesman jon = new Salesman("Jon", 1100);
		Salesman tim = new Salesman("Tim", 100);
		Salesman litmen = new Salesman("Litmen", 300);
		Salesman abram = new Salesman("Abram", 1110);
		Salesman frank = new Salesman("Frank", 80);
		Salesman luna = new Salesman("Luna", 500);
	    Salesman[] allSales = new Salesman[]{blade, jon, tim, litmen, abram, frank, luna};
	    Salesman[] topfive = Salesman.getTopFive(allSales);
	    for(int i = 0; i < 5; i++){
	        System.out.println( (i+1) + " " + topfive[i].display() );
	    }
	}
}
