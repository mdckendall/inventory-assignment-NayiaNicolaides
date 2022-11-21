import java.io.Serializable;

public class Item implements Serializable{
  String name;
  String serial;
  String value; 

  @Override
  public String toString() {
    return ""+name+","+serial+","+value+"";
  }
  
  public Item(String name, String serial, String value){
    this.name = name;
    this.serial = serial;
    this.value = value;
  }
}
