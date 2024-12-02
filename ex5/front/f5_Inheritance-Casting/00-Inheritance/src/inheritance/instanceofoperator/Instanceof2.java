package inheritance.instanceofoperator;

//interface Shape {}
//
//interface NotRoundShape {}


//class Square implements Shape, NotRoundShape {}

public class Instanceof2 {

   public static void main(String[] args) {
      Ellipsis i = new Ellipsis();
      Round a = new Round();
      Ellipsis b = new Ellipsis();
      Circle c = new Circle();

      
      System.out.println(a instanceof Ellipsis); //line 1
      System.out.println(c instanceof Round); //line 2

   }
}