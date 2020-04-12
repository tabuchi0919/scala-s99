package s99

object P11 {
  def encodeModified[T](list: List[T]): List[Any] =
    P09.pack(list).map(l => if (l.length == 1) l.head else (l.length, l.head))
}
