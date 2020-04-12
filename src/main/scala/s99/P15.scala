package s99

object P15 {
  def duplicateN[T](n: Int, list: List[T]): List[(T)] =
    list.foldRight(Nil: List[T]) { (e, res) =>
      List.fill(n)(e) ::: res
    }
}
