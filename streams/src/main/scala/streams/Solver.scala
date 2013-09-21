package streams

import common._

/**
 * This component implements the solver for the Bloxorz game
 */
trait Solver extends GameDef {

  /**
   * Returns `true` if the block `b` is at the final position
   */
  def done(b: Block): Boolean = b.isStanding && b.b1.x==goal.x &&  b.b1.y==goal.y

  /**
   * This function takes two arguments: the current block `b` and
   * a list of moves `history` that was required to reach the
   * position of `b`.
   * 
   * The `head` element of the `history` list is the latest move
   * that was executed, i.e. the last move that was performed for
   * the block to end up at position `b`.
   * 
   * The function returns a stream of pairs: the first element of
   * the each pair is a neighboring block, and the second element
   * is the augmented history of moves required to reach this block.
   * 
   * It should only return valid neighbors, i.e. block positions
   * that are inside the terrain.
   */
  def neighborsWithHistory(b: Block, history: List[Move]): Stream[(Block, List[Move])] = {
    val test = b.legalNeighbors map (neighbor => (neighbor._1,neighbor._2::history))

    val lol = test.toStream
//    println("neighborsWithHistory" + lol)
    lol
  }

  /**
   * This function returns the list of neighbors without the block
   * positions that have already been explored. We will use it to
   * make sure that we don't explore circular paths.
   */
  def newNeighborsOnly(neighbors: Stream[(Block, List[Move])],
                       explored: Set[Block]): Stream[(Block, List[Move])] = {
    val test = neighbors filter ( nei => !explored.contains(nei._1))
    println("newNeighborsOnly" + test)
    println ("explored" + explored)
    test
  }

  /**
   * The function `from` returns the stream of all possible paths
   * that can be followed, starting at the `head` of the `initial`
   * stream.
   * 
   * The blocks in the stream `initial` are sorted by ascending path
   * length: the block positions with the shortest paths (length of
   * move list) are at the head of the stream.
   * 
   * The parameter `explored` is a set of block positions that have
   * been visited before, on the path to any of the blocks in the
   * stream `initial`. When search reaches a block that has already
   * been explored before, that position should not be included a
   * second time to avoid cycles.
   * 
   * The resulting stream should be sorted by ascending path length,
   * i.e. the block positions that can be reached with the fewest
   * amount of moves should appear first in the stream.
   * 
   * Note: the solution should not look at or compare the lengths
   * of different paths - the implementation should naturally
   * construct the correctly sorted stream.
   */
//  breadth-first search: here, we proceed more cautiously. 
//  When we find the neighbors of our current state, we explore each of them for each step. 
//  The respective neighbors of these states are then stored to be explored at a later time.
//  def from(initial: Stream[(Block, List[Move])],
//           explored: Set[Block]): Stream[(Block, List[Move])] = {
//    if (initial.isEmpty) Stream.Empty
//    else {
//      val more = for {
//        path <- initial
//        next <- newNeighborsOnly(neighborsWithHistory(path._1,path._2),explored)  
//      }yield {
//        next
////        val test =path
//      }
//      val totalstream = (initial++more).sortBy(f => f._2.length)   
//      println(totalstream.toList);
//      val mov = more.map (stream => stream._2.head).toList
////      val test = 
//      val explo = explored.flatMap(block => List(block,block.right,block.left,block.up,block.down))
////        mov match{
////        case Right 	=> block.right
////        case Left 	=> block.left
////        case Up 	=> block.up
////        case Down	=> block.down
////      })
//      println("new explo" + explo)
//      from(totalstream,explored ++ explo)    
//    }
//  }
  def from(initial: Stream[(Block, List[Move])],
           explored: Set[Block]): Stream[(Block, List[Move])] = initial match {
    case (block,moves) #:: xs => {
      val ys = newNeighborsOnly(neighborsWithHistory(block,moves), explored)
      (block,moves) #:: from(xs ++ ys, explored + block)
    }
    case _ => Stream.empty
  }
  
  /**
   * The stream of all paths that begin at the starting block.
   */
  lazy val pathsFromStart: Stream[(Block, List[Move])] = from(List((startBlock,Nil)).toStream,Set(startBlock))

  /**
   * Returns a stream of all possible pairs of the goal block along
   * with the history how it was reached.
   */
  lazy val pathsToGoal: Stream[(Block, List[Move])] = pathsFromStart.filter( block => done(block._1))

  /**
   * The (or one of the) shortest sequence(s) of moves to reach the
   * goal. If the goal cannot be reached, the empty list is returned.
   *
   * Note: the `head` element of the returned list should represent
   * the first move that the player should perform from the starting
   * position.
   */
  lazy val solution: List[Move] ={ val test = pathsToGoal.sortBy(f => f._2.length)    
    							 if (test.isEmpty) List()
    							 else test.head._2.reverse
  }
}
