public class Box
{
 double l;
 double h;
 double w;
 Box(){
  this.h=-1;
  this.l=-1;
  this.w=-1;
 }
  Box(double side) {
  this.l = side;
  this.w=side;
  this.h=side;
 }

  Box(double l, double h, double w) {
  this.l = l;
  this.h = h;
  this.w = w;
 }
 Box(Box old){
  this.l= old.l;
  this.h=old.h;
  this.w= old.w;
 }
 public void information(){
  System.out.println("Running the box");
 }
}
