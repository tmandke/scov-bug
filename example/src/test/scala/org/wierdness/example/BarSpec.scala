package org.wierdness.example

import org.scalatest._

class BarSpec extends FlatSpec with Matchers with OptionValues with Inside with Inspectors {
  it should "return foo" in {
    new Bar().retFoo shouldEqual "foo"
  }
  it should "return bar" in {
    new Bar().retBar shouldEqual "bar"
  }
}
