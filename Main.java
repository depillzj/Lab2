class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int total;
    double blue;
    double brown;
    double green;
    double orange;
    double red;
    double yellow;
total = 55 * 11;
blue = total * .24;
brown = total * .13;
green = total * .16;
orange = total * .20;
red = total * .13;
yellow = total * .14;
System.out.println("blue: " + blue);
System.out.println("brown: " + brown);
System.out.println("green: " + green);
System.out.println("orange: " + orange);
System.out.println("red: " + red);
System.out.println("yellow: " + yellow);
double sum;
sum = blue + brown + green + orange + red + yellow;
System.out.println("sum: " + sum);
if ( blue < brown && red > orange)
   System.out.println("blue under brown and red over orange");
if ( brown >= green)
  System.out.println("brown is greater than or equal to green");
if ( sum == total)
   System.out.println("Numbers match");

  }
}