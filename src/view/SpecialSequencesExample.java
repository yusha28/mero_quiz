class Shape {
    void draw() {
      System.out.println("Drawing Shape");
    }
  }
  
  class Circle extends Shape {
    @Override
    void draw() {
      System.out.println("Drawing Circle");
    }
  }