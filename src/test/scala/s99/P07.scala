package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P07Spec extends FunSpec with DiagrammedAssertions {
  describe("P07") {
    it("for example") {
      assert(
        P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) ==
          List(1, 1, 2, 3, 5, 8)
      )
    }
  }
}
