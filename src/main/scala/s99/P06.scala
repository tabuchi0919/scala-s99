package s99

object P06 {
  def isPalindrome[A](list: List[A]): Boolean = (list == list.reverse)
}
