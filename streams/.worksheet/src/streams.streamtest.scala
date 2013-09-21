package streams
import  common._
import Bloxorz._


object streamtest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(115); 
  println("Welcome to the Scala worksheet");$skip(144); 
  

  
  val level =
    """ooo-------
      |oSoooo----
      |ooooooooo-
      |-ooooooooo
      |-----ooToo
      |------ooo-""".stripMargin
  case class Pos(x: Int, y: Int) {
    /** The position obtained by changing the `x` coordinate by `d` */
    def dx(d: Int) = copy(x = x + d)

    /** The position obtained by changing the `y` coordinate by `d` */
    def dy(d: Int) = copy(y = y + d)
  };System.out.println("""level  : String = """ + $show(level ));$skip(480); 
  
  def terrainFunction(levelVector: Vector[Vector[Char]]): Pos => Boolean = {
    println(levelVector)
    (p:Pos) => levelVector.apply(p.x).apply(p.y) match {
      case '-' 		=> false
      case other 	=> true
    }
  };System.out.println("""terrainFunction: (levelVector: Vector[Vector[Char]])streams.streamtest.Pos => Boolean""")}
 // val test = terrainFunction(level)
  

}
