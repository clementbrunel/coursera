package objsets

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(185); val res$0 = 
  
  
  new TestSets {
  
  set5.filter(tw => tw.user == "a").print
  val test = set2.mostRetweeted
  println(test)
  val des=set5.descendingByRetweet
  des.foreach( l => println(l))
};System.out.println("""res0: objsets.TestSets{val test: objsets.Tweet; val des: objsets.TweetList} = """ + $show(res$0))}
	import TweetReader._
	//println(TweetReader.allTweets)
}


  trait TestSets {
    val set1 = new Empty   //1.0
    val set2 = set1.incl(new Tweet("a", "a body", 20)) //1.1
    val set3 = set2.incl(new Tweet("b", "b body", 20)) //1.2
    val c = new Tweet("c", "c body", 7) //0.1
    val d = new Tweet("d", "d body", 9) //0.1
    val set4c = set3.incl(c)  //1.3
    val set4d = set3.incl(d) //1.3
    val set5 = set4c.incl(d)  //1.4
  }
