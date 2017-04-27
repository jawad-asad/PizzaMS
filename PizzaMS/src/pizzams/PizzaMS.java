package pizzams;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaMS {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Pizza> pizzaRiba = new ArrayList<>(); 
        while(true){
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║                   PIZZA RIBBA                   ║");
        System.out.println("║-------------------------------------------------║");
        System.out.println("║                                                 ║");        
        System.out.println("║ 1) Create Pizza                                 ║");        
        System.out.println("║                                                 ║");        
        System.out.println("║ 2) Decorate Pizza                               ║");
        System.out.println("║                                                 ║");
        System.out.println("║ 3) Clone    Pizza                               ║");
        System.out.println("║                                                 ║");
        System.out.println("║ 4) Show Pizza                                   ║");
        System.out.println("║                                                 ║");
        System.out.println("║ 5) Exit                                         ║");
        System.out.println("║                                                 ║");
        System.out.println("╚═══════════════════════════════╝");
        System.out.print("Select Option:");
        int option = s.nextInt();
        if(option == 1){
            pizzaRiba.add (createPizza());
        }
        else if(option == 2){
          showPizzas(pizzaRiba);
          int v = s.nextInt();
          decoratePizza(pizzaRiba.get(v));
        }
        else if(option == 3){
          showPizzas(pizzaRiba);
          int v = s.nextInt();
          pizzaRiba.add(clonePizza(pizzaRiba.get(v)));
        }
        else if(option == 4){
            showPizzas(pizzaRiba);
        }
        else if(option == 5){
         break;   
        }
        }
    }
    static PizzaBuilder builder;
    static void showPizzas(ArrayList<Pizza> pizza){
        for (int i = 0; i < pizza.size(); i++) {
            Pizza m = pizza.get(i);
            System.out.println(String.format("%s) \t%s\t%s\t%s\t\t Decorated \t %s",i,m.getDough(), m.getSauce(), m.getTopping(),m.getDecorate()));
        }
    }
    static Pizza createPizza(){
        while(true){
        System.out.println("Type of Pizza you want to create");
        System.out.println("1- Spicy Pizza");
        System.out.println("2- Hawaiian Pizza");
        int option = s.nextInt();
        switch(option){
            case 1:
                builder = new SpicyPizzaBuilder();
                builder.createNewPizzaProduct();
                builder.buildDough();
                builder.buildSauce();
                builder.buildTopping();
                return builder.getPizza();
            case 2:
                builder = new HawaiianPizzaBuilder();
                builder.createNewPizzaProduct();
                builder.buildDough();
                builder.buildSauce();
                builder.buildTopping();
                return builder.getPizza();
            }
        }
    }
    static void decoratePizza(Pizza pizza){
        new ChickenTikkaPizza(pizza);
    }
    static Pizza clonePizza(Pizza pizza){
        return (Pizza)pizza.clone();
    }
}
