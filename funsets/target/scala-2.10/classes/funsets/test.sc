package funsets

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  import FunSets._
  val s1 = singletonSet(1)                        //> s1  : Int => Boolean = <function1>
  val s2 = singletonSet(2)                        //> s2  : Int => Boolean = <function1>
  val s3 = singletonSet(3)                        //> s3  : Int => Boolean = <function1>
  val s = union(s1, s2)                           //> s  : Int => Boolean = <function1>
  val i = intersect(s, s2)                        //> i  : Int => Boolean = <function1>
  val d = diff(s, s2)                             //> d  : Int => Boolean = <function1>
  printSet(s)                                     //> {1,2}
  printSet(i)                                     //> {2}
  printSet(d)                                     //> {1}
  forall(s,s1)                                    //> res0: Boolean = false
  val one = exists(s1,s)                          //> one  : Boolean = true
  
  val s4 = singletonSet(4)                        //> s4  : Int => Boolean = <function1>
  val s5 = singletonSet(5)                        //> s5  : Int => Boolean = <function1>
  val s7 = singletonSet(7)                        //> s7  : Int => Boolean = <function1>
  val s1000 = singletonSet(1000)                  //> s1000  : Int => Boolean = <function1>
  
  val left = union(union(union(union(union(s1, s3),s4),s5),s7),s1000 )
                                                  //> left  : Int => Boolean = <function1>
   printSet(left)                                 //> {1,3,4,5,7,1000}
  val right =union(union(union(s1, s2),s3),s4)    //> right  : Int => Boolean = <function1>
  printSet(right)                                 //> {1,2,3,4}
  //diff of {1,3,4,5,7,1000} and {1,2,3,4}
  val diffe = diff(left, right)                   //> diffe  : Int => Boolean = <function1>
  
  
  printSet(diffe)                                 //> {5,7,1000}
}