package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    (c,r) match {
    				case(0,0)=> 1
    				case(c,r) if (c<0 ||c>r)=> 0
    				case(c,r)=>pascal(c-1,r-1)+pascal(c,r-1)
    	}
  }
  /**
   * Exercise 2
   * chars.isEmpty: Boolean returns whether a list is empty
	 chars.head: Char returns the first element of the list
	 chars.tail: List[Char] returns the list without the first element
   */
  def balance(chars: List[Char]): Boolean = {
    //Open: the number of open parenthesis
    def balanceIteration(chars: List[Char], opened: Int): Int ={
      if(chars.isEmpty) opened  //parsing is finished
      else if(chars.head == ')' && opened == 0) -1  //bad formating
      else if(chars.head == ')') 
        balanceIteration(chars.tail, opened - 1)  //-- open parenthesis needed
      else if(chars.head == '(') 
        balanceIteration(chars.tail, opened + 1)  //++ open parenthesis needed
      else
        balanceIteration(chars.tail, opened)
      }

    (balanceIteration(chars, 0) == 0) 
    
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
 println(coins.sorted)
    def count(money: Int, coins: List[Int]): Int = {
      if (money == 0) 1
      else if (money < 0 || coins.isEmpty) 0
      else count(money, coins.tail) + count(money - coins.head, coins)
    }
    count(money, coins.sorted)
 
  }
}
