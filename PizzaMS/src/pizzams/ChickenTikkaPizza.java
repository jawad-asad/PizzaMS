
package pizzams;

import pizzams.Pizza;
import pizzams.PizzaDecorator;


class ChickenTikkaPizza extends PizzaDecorator {
    
    public ChickenTikkaPizza(Pizza newPizza) {
        super(newPizza);
        newPizza.setDecorate(newPizza.getDecorate()+" 'Chicken Tikka'");
    }
}
