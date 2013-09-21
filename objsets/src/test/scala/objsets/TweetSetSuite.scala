package objsets

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TweetSetSuite extends FunSuite {
  trait TestSets {
    val set1 = new Empty   //1.0
    val set2 = set1.incl(new Tweet("a", "a body", 20)) //1.1
    val set3 = set2.incl(new Tweet("b", "b body", 20)) //1.2
    val c = new Tweet("c", "c body", 7) //0.1
    val d = new Tweet("d", "d body", 9) //0.1
    val set4c = set3.incl(c)  //1.3
    val set4d = set3.incl(d) //1.3
    val set5 = set4c.incl(d)  //1.4
//    set1.foreach(f => println(f))
//    println(set5)
  }

  def asSet(tweets: TweetSet): Set[Tweet] = {
    var res = Set[Tweet]()
    tweets.foreach(res += _)
    res
  }

  def size(set: TweetSet): Int = asSet(set).size

  test("filter: on empty set") {
    new TestSets {
      assert(size(set1.filter(tw => tw.user == "a")) === 0)
    }
  }

  test("filter: a on set5") {
    new TestSets {
      assert(size(set5.filter(tw => tw.user == "a")) === 1)
    }
  }

  test("filter: 20 on set5") {
    new TestSets {
      assert(size(set5.filter(tw => tw.retweets == 20)) === 2)
    }
  }

  test("union: set4c and set4d") {
    new TestSets {
      assert(size(set4c.union(set4d)) === 4)
    }
  }

  test("union: with empty set (1)") {
    new TestSets {
      assert(size(set5.union(set1)) === 4)
    }
  }

  test("union: set2 et set3)") {
    new TestSets {
      assert(size(set2.union(set3)) === 2)
    }
  }
  
   test("union: with empty set (2)") {
    new TestSets {
      assert(size(set1.union(set5)) === 4)
    }
  }
  
   test("most retweet: set2") {
    new TestSets {
      
      assert(set2.mostRetweeted.retweets == 20)
    }
  }
   
   
  test("descending: set5") {
    new TestSets {
      val trends = set5.descendingByRetweet
      assert(!trends.isEmpty)
      assert(trends.head.user == "a" || trends.head.user == "b")
    }
  }
  
  test("filter: 321") {
    new TestSets {
      assert(size(TweetReader.allTweets.filter(tw => tw.retweets == 20)) === 12)
    }
  }
  
  test("trending: google and applet tweets") {
      assert(!GoogleVsApple.trending.isEmpty)
  }
}
