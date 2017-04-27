
package pizzams;

abstract class PizzaDecorator implements IPizza {
    
    Pizza pizza;

    public PizzaDecorator(Pizza newPizza) {
        this.pizza = newPizza;
    }

    @Override
    public String bakePizza() {
        return pizza.bakePizza();
    }
}
