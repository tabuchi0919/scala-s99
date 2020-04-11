package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P09Spec extends FunSpec with DiagrammedAssertions {
  describe("P09") {
    it("for example") {
      assert(
        P09.pack(
          List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
        ) == List(
          List('a, 'a, 'a, 'a),
          List('b),
          List('c, 'c),
          List('a, 'a),
          List('d),
          List('e, 'e, 'e, 'e)
        )
      )
    }
  }
}
