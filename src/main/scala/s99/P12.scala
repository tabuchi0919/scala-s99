package s99

object P12 {
  def decode[T](list: List[(Int, T)]): List[T] = list.foldLeft(List[T]()) {
    (res, e) =>
      res ::: List.fill(e._1)(e._2)
  }
}
