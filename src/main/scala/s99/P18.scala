package s99

object P18 {
  def slice[T](n: Int, m: Int, l: List[T]) = l.take(m).drop(n)
}
