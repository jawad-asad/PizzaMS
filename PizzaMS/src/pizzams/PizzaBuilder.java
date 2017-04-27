
package pizzams;

abstract class PizzaBuilder implements IToppings {
    
    protected Pizza pizza;
    
    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }
    
}
