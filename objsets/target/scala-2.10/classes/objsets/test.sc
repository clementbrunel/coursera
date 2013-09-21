package objsets

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  new TestSets {
  
  set5.filter(tw => tw.user == "a").print
  val test = set2.mostRetweeted
  println(test)
  val des=set5.descendingByRetweet
  des.foreach( l => println(l))
}                                                 //> a body
                                                  //| User: a
                                                  //| Text: a body [20]
                                                  //| User: b
                                                  //| Text: b body [20]
                                                  //| User: a
                                                  //| Text: a body [20]
                                                  //| User: d
                                                  //| Text: d body [9]
                                                  //| User: c
                                                  //| Text: c body [7]
                                                  //| res0: objsets.TestSets{val test: objsets.Tweet; val des: objsets.TweetList} 
                                                  //| = objsets.test$$anonfun$main$1$$anon$1@71394e2d
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