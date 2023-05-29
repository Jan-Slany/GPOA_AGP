public class Circle {     
  private int radius;  
  
  public Circle(int radius) {         
    this.radius = radius;     
  }     
  
  // setting values     
  public void setRadius(int radius) {         
    this.radius = radius;     
  }     
  
  // getting values     
  public int getRadius() {         
    return radius;     
  }     
  
  // functions     
  @Override     
  public String toString() {         
    return "Radius: " + this.radius;     
  } 
}   

     

