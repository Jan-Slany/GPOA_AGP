public class Rectangle {
  private int height;
  private int width;

  public Rectangle(int h, int w) {
    this.height = h;
    this.width = w;
  }

  // setting values
  public void setHeight(int height) {
    this.height = height;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  // getting values
  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  // functions
  public int RectangleArea() {
    return this.width * this.height;
  }

  public int RectanglePerimeter() {
    return 2 * (this.width + this.height);
  }
}
