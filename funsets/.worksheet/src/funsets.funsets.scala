package funsets

object funsets {
import FunSets._;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 

    val s1 = singletonSet(1);System.out.println("""s1  : Int => Boolean = """ + $show(s1 ));$skip(29); 
    val s2 = singletonSet(2);System.out.println("""s2  : Int => Boolean = """ + $show(s2 ));$skip(29); 
    val s3 = singletonSet(3);System.out.println("""s3  : Int => Boolean = """ + $show(s3 ));$skip(26); 
 
  val s = union(s1, s2);System.out.println("""s  : Int => Boolean = """ + $show(s ))}
      
}
