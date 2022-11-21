import java.util.ArrayList;
import java.io.Serializable;

public class Inventory implements Serializable{
  ArrayList<Item> items = new ArrayList<Item>();
  public Inventory(){
  }
}