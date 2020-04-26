package s99

object P20 {
  def removeAt[T](n: Int, l: List[T]) = {
    (l.zipWithIndex.filter(_._2 != n).map(_._1), l(n))
  }
}
