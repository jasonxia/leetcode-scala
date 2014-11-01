package hard

import org.specs2.mutable.Specification
import NQueens._

/**
 * Created by yongmin_xia on 1/11/2014.
 */

/**********************************************************************************
  *
  * The n-queens puzzle is the problem of placing n queens on an n×n chessboard
  * such that no two queens attack each other.
  *
  * Given an integer n, return all distinct solutions to the n-queens puzzle.
  *
  * Each solution contains a distinct board configuration of the n-queens' placement,
  * where 'Q' and '.' both indicate a queen and an empty space respectively.
  *
  * For example,
  * There exist two distinct solutions to the 4-queens puzzle:
  *
  * [
  *  [".Q..",  // Solution 1
  *   "...Q",
  *   "Q...",
  *   "..Q."],
  *
  *  ["..Q.",  // Solution 2
  *   "Q...",
  *   "...Q",
  *   ".Q.."]
  * ]
  *
  *
  **********************************************************************************/

class NQueensSpec extends Specification {
  "queens on 4x4 chessboard" in {
    val result = queens(4)
    result.size === 2
    result.contains(List(1, 3, 0, 2))
    result.contains(List(2, 0, 3, 1))
  }
}
