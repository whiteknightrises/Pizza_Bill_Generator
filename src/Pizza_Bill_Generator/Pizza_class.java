package Pizza_Bill_Generator;

public class Pizza_class {
boolean veg;
int price;
int take_away=20;
int add_cheese=100;
int extra_toppings=150;
int base_pizza_price;
boolean isCheese=false;
boolean isTopping=false;
boolean isTakeaway=false;

public Pizza_class(boolean veg) {
	super();
	this.veg = veg;
	if(this.veg) {
		this.price=300;
	}
	else {
		this.price=400;
	}
	base_pizza_price=this.price;
}

public void Extra_Toppings() {
	isTopping=true;
	this.price+=extra_toppings;
}
public void Add_Cheese() {
	isCheese=true;
	this.price+=add_cheese;
}
public void Take_Away() {
	isTakeaway=true;
	this.price+=take_away=20;
}
public void get_bill() {
	String bill="";
	System.out.println("Pizza "+this.base_pizza_price);
	if(isCheese) {
		bill+="extra cheese added "+add_cheese+ "\n";
	}
    if(isTopping) {
    	bill+="extra cheese added "+extra_toppings+ "\n";
	}
    if(isTakeaway) {
    	bill+="extra cheese added "+isTakeaway+ "\n";
  }
    bill+="bill "+this.price+ "\n";
    System.out.println(bill);
}

}
