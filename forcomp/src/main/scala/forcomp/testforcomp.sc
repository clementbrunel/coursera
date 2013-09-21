package forcomp

object testforcomp {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val lard = List(('a', 1), ('d', 1), ('l', 1), ('r', 1))
                                                  //> lard  : List[(Char, Int)] = List((a,1), (d,1), (l,1), (r,1))
  val r = List(('r', 1))                          //> r  : List[(Char, Int)] = List((r,1))
  val lad = List(('a', 1), ('d', 1), ('l', 1))    //> lad  : List[(Char, Int)] = List((a,1), (d,1), (l,1))
  
   Anagrams.subtract(lard, r)                     //> res0: forcomp.Anagrams.Occurrences = List((a,1), (d,1), (l,1))
   
 val test =  Anagrams.sentenceOccurrences(List("test")).map ( occ => (occ._1.toString*occ._2))
                                                  //> test  : List[String] = List(e, s, tt)



	  val sentence = List("Linux", "rulez")   //> sentence  : List[String] = List(Linux, rulez)
		val sentence2 = List("lade" )     //> sentence2  : List[String] = List(lade)
	

	Anagrams.subtract(Anagrams.wordOccurrences("Linuxrulez"),Anagrams.wordOccurrences("ex")).map ( occ => (occ._1.toString*occ._2))
                                                  //> res1: List[String] = List(i, ll, n, r, uu, z)
     
    
   Anagrams.sentenceAnagrams(sentence)            //> res2: List[forcomp.Anagrams.Sentence] = List(List(Zulu, Lin, Rex), List(Zulu
                                                  //| , nil, Rex), List(Zulu, Rex, Lin), List(Zulu, Rex, nil), List(null, Uzi, Rex
                                                  //| ), List(null, Rex, Uzi), List(Uzi, null, Rex), List(Uzi, Rex, null), List(Li
                                                  //| n, Zulu, Rex), List(Lin, Rex, Zulu), List(nil, Zulu, Rex), List(nil, Rex, Zu
                                                  //| lu), List(Linux, rulez), List(Rex, Zulu, Lin), List(Rex, Zulu, nil), List(Re
                                                  //| x, null, Uzi), List(Rex, Uzi, null), List(Rex, Lin, Zulu), List(Rex, nil, Zu
                                                  //| lu), List(rulez, Linux))
   
  // List(List(De, Al), Ed Al Ad De Al Ed dale deal lead
}