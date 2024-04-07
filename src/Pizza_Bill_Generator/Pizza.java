package Pizza_Bill_Generator;

public class Pizza {	
public static void main(String[] args) {
	Pizza_class p = new Pizza_class(false);
	p.Add_Cheese();
	p.Extra_Toppings();
	p.get_bill();
	Delux_pizza dp = new Delux_pizza(true);
	dp.get_bill();
}


}
