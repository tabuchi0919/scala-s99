package s99

object P09 {
  def pack[T](list: List[T]): List[List[T]] =
    list.foldLeft(Nil: List[List[T]]) { (res, e) =>
      if (res == Nil) {
        (e :: Nil) :: Nil
      } else if (res.last.head == e) {
        res.init :+ (e :: res.last)
      } else {
        res :+ (e :: Nil)
      }
    }
}
