package s99

object P08 {
  def compress[T](list: List[T]): List[T] = P09.pack(list).map(_.head)
}
