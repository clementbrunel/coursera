package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s3 = singletonSet(3)
 
  val s = union(s1, s2)
  println(s.toString)
  println(contains(s, 1))
  
  
  val all = forall(s1,s1) 
  println(all)
  
  val one = exists(s,s3) 
  println("exist" + one)
}
