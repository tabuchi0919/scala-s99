package s99

object P19 {
  def rotate[T](n: Int, l: List[T]) = {
    val t = l.splitAt((n + l.length) % l.length)
    t._2 ::: t._1
  }
}
