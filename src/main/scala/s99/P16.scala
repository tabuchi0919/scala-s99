package s99

object P16 {
  def drop[T](n: Int, l: List[T]) =
    l.zipWithIndex.filter(_._2 % n != n - 1).map(_._1)
}
