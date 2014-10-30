package medium

import org.specs2.mutable.Specification
import ReverseWordsInAString._

/**
 * Created by yongmin_xia on 30/10/2014.
 */

/**********************************************************************************
  *
  * Given an input string, reverse the string word by word.
  *
  * For example,
  * Given s = "the sky is blue",
  * return "blue is sky the".
  *
  *
  * Clarification:
  *
  * What constitutes a word?
  * A sequence of non-space characters constitutes a word.
  * Could the input string contain leading or trailing spaces?
  * Yes. However, your reversed string should not contain leading or trailing spaces.
  * How about multiple spaces between two words?
  * Reduce them to a single space in the reversed string.
  *
  *
  **********************************************************************************/

class ReverseWordsInAStringSpec extends Specification {
  "reverse(' ')" in {
    reverse(" ") === ""
  }

  "reverse('I ')" in {
    reverse("I ") === "I"
  }

  "reverse('love')" in {
    reverse("love") === "love"
  }

  "reverse('I love Scala')" in {
    reverse("I love Scala") === "Scala love I"
  }

  "reverse('I  love  Scala')" in {
    reverse("I  love  Scala") === "Scala love I"
  }

}
