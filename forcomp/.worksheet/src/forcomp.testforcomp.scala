package forcomp

object testforcomp {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  println("Welcome to the Scala worksheet");$skip(61); 
  
  val lard = List(('a', 1), ('d', 1), ('l', 1), ('r', 1));System.out.println("""lard  : List[(Char, Int)] = """ + $show(lard ));$skip(25); 
  val r = List(('r', 1));System.out.println("""r  : List[(Char, Int)] = """ + $show(r ));$skip(47); 
  val lad = List(('a', 1), ('d', 1), ('l', 1));System.out.println("""lad  : List[(Char, Int)] = """ + $show(lad ));$skip(33); val res$0 = 
  
   Anagrams.subtract(lard, r);System.out.println("""res0: forcomp.Anagrams.Occurrences = """ + $show(res$0));$skip(99); 
   
 val test =  Anagrams.sentenceOccurrences(List("test")).map ( occ => (occ._1.toString*occ._2));System.out.println("""test  : List[String] = """ + $show(test ));$skip(44); 



	  val sentence = List("Linux", "rulez");System.out.println("""sentence  : List[String] = """ + $show(sentence ));$skip(32); 
		val sentence2 = List("lade" );System.out.println("""sentence2  : List[String] = """ + $show(sentence2 ));$skip(132); val res$1 = 
	

	Anagrams.subtract(Anagrams.wordOccurrences("Linuxrulez"),Anagrams.wordOccurrences("ex")).map ( occ => (occ._1.toString*occ._2));System.out.println("""res1: List[String] = """ + $show(res$1));$skip(50); val res$2 = 
     
    
   Anagrams.sentenceAnagrams(sentence);System.out.println("""res2: List[forcomp.Anagrams.Sentence] = """ + $show(res$2))}
   
  // List(List(De, Al), Ed Al Ad De Al Ed dale deal lead
}
