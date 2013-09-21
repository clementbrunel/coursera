package streams
import  common._
import Bloxorz._


object streamtest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  

  
  val level =
    """ooo-------
      |oSoooo----
      |ooooooooo-
      |-ooooooooo
      |-----ooToo
      |------ooo-""".stripMargin                  //> level  : String = ooo-------
                                                  //| oSoooo----
                                                  //| ooooooooo-
                                                  //| -ooooooooo
                                                  //| -----ooToo
                                                  //| ------ooo-
  case class Pos(x: Int, y: Int) {
    /** The position obtained by changing the `x` coordinate by `d` */
    def dx(d: Int) = copy(x = x + d)

    /** The position obtained by changing the `y` coordinate by `d` */
    def dy(d: Int) = copy(y = y + d)
  }
  
  def terrainFunction(levelVector: Vector[Vector[Char]]): Pos => Boolean = {
    println(levelVector)
    (p:Pos) => levelVector.apply(p.x).apply(p.y) match {
      case '-' 		=> false
      case other 	=> true
    }
  }                                               //> terrainFunction: (levelVector: Vector[Vector[Char]])streams.streamtest.Pos =
                                                  //| > Boolean
 // val test = terrainFunction(level)
  

}