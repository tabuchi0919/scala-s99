package s99

object P13 {
  def encode[T](list: List[T]): List[(Int, T)] =
    list.foldLeft(Nil: List[(Int, T)]) { (res, e) =>
      if (res == Nil) {
        (1, e) :: Nil
      } else if (res.last._2 == e) {
        res.init :+ (res.last._1 + 1, res.last._2)
      } else {
        res :+ (1, e)
      }
    }
}
