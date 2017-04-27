package pizzams;
public class Pizza implements IPizza, Cloneable {
    private String dough = "";
    private String sauce = "";
    private String topping = "";
    private String decorate = "";
    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
    public String getTopping()
    {
        return topping;
    }
    public String getSauce()
    {
        return sauce;
    }
    public String getDough()
    {
        return dough;
    }
    @Override
    public String bakePizza() {
        return "";
    }
    public Object clone() {
      Object clone = null;
      try 
      {
         clone = super.clone();
      } 
      catch (CloneNotSupportedException e) 
      {
         e.printStackTrace();
      }
      return clone;
   }

    public String getDecorate() {
        return decorate;
    }
    public void setDecorate(String value) {
        decorate = value;
    }
}
