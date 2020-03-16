package factory;

public class PizzaHut extends PizzaStore{
	public PizzaHut() {
		super("pizzaHut");
		
	}
	public Pizza order(String name) {
		return factory.createPizza(name);
	}
	//자지가 해야 할 일을 다른 객체에 위임 하는 것을 델리게이션이라 함
}
