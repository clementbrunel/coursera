package funsets

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet")
  import FunSets._;$skip(46); 
  val s1 = singletonSet(1);System.out.println("""s1  : Int => Boolean = """ + $show(s1 ));$skip(27); 
  val s2 = singletonSet(2);System.out.println("""s2  : Int => Boolean = """ + $show(s2 ));$skip(27); 
  val s3 = singletonSet(3);System.out.println("""s3  : Int => Boolean = """ + $show(s3 ));$skip(24); 
  val s = union(s1, s2);System.out.println("""s  : Int => Boolean = """ + $show(s ));$skip(27); 
  val i = intersect(s, s2);System.out.println("""i  : Int => Boolean = """ + $show(i ));$skip(22); 
  val d = diff(s, s2);System.out.println("""d  : Int => Boolean = """ + $show(d ));$skip(14); 
  printSet(s);$skip(14); 
  printSet(i);$skip(14); 
  printSet(d);$skip(15); val res$0 = 
  forall(s,s1);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(25); 
  val one = exists(s1,s);System.out.println("""one  : Boolean = """ + $show(one ));$skip(30); 
  
  val s4 = singletonSet(4);System.out.println("""s4  : Int => Boolean = """ + $show(s4 ));$skip(27); 
  val s5 = singletonSet(5);System.out.println("""s5  : Int => Boolean = """ + $show(s5 ));$skip(27); 
  val s7 = singletonSet(7);System.out.println("""s7  : Int => Boolean = """ + $show(s7 ));$skip(33); 
  val s1000 = singletonSet(1000);System.out.println("""s1000  : Int => Boolean = """ + $show(s1000 ));$skip(74); 
  
  val left = union(union(union(union(union(s1, s3),s4),s5),s7),s1000 );System.out.println("""left  : Int => Boolean = """ + $show(left ));$skip(18); 
   printSet(left);$skip(47); 
  val right =union(union(union(s1, s2),s3),s4);System.out.println("""right  : Int => Boolean = """ + $show(right ));$skip(18); 
  printSet(right);$skip(75); 
  //diff of {1,3,4,5,7,1000} and {1,2,3,4}
  val diffe = diff(left, right);System.out.println("""diffe  : Int => Boolean = """ + $show(diffe ));$skip(24); 
  
  
  printSet(diffe)}
}
