package s99

object P14 {
  def duplicate[T](list: List[T]): List[(T)] =
    list.foldRight(Nil: List[T]) { (e, res) =>
      e :: e :: res
    }
}
