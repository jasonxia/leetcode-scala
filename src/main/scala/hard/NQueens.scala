package hard

/**
 * Created by yongmin_xia on 1/11/2014.
 */
object NQueens {
  def queens(n: Int): Set[List[Int]] = {
    def placeQueens(k: Int): Set[List[Int]] = {
      if(k == 0) Set(List())
      else for {
        queens <- placeQueens(k - 1)
        col <- 0 until n
        if isSafe(col, queens)
      } yield col :: queens
    }
    placeQueens(n)
  }

  def isSafe(col: Int, queens: List[Int]): Boolean = {
    val rows = queens.length
    val rowWithQueens = (rows - 1 to 0 by -1) zip queens
    rowWithQueens forall {
      case(r, c) => col != c && math.abs(col - c) != rows - r
    }
  }
}
