package com.example

import org.scalatest.{ Matchers, WordSpec }

class CalculatorSpec extends WordSpec with Matchers {
    
    "A calculator" should {
        "add two numbers correctly" in {
            Calculator.add(2, 3) should be (5)
        }
    }

}
