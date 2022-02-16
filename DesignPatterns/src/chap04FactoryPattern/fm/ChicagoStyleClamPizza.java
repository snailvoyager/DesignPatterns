package chap04FactoryPattern.fm;

public class ChicagoStyleClamPizza extends Pizza {		//상품 추상화 객체를 구현하는 구상 클래스
	public ChicagoStyleClamPizza() {
		name = "Chicago Style Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Frozen Clams from Chesapeake Bay");
	}
 
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
