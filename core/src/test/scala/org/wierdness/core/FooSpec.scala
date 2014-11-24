package org.wierdness.core

import org.scalatest._

class FooSpec extends FlatSpec with Matchers with OptionValues with Inside with Inspectors {
  it should "return foo" in {
    new Foo().retFoo shouldEqual "foo"
  }
}
