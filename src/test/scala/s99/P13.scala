package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P13Spec extends FunSpec with DiagrammedAssertions {
  describe("P13") {
    it("for example") {
      assert(
        P13.encode(
          List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
        ) == List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      )
    }
  }
}
