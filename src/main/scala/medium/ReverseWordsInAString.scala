package medium

/**
 * Created by yongmin_xia on 30/10/2014.
 */
object ReverseWordsInAString {
  def reverse(s: String): String = {
    s.split(" ").filterNot(_.isEmpty).foldLeft(List[String]())((acc, w) => { w :: acc }).mkString(" ")
  }
}
