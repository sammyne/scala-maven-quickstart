/* Copyright (C) 2023 sammyne. All rights reserved. */
package com.github.sammyne

package object greeter {
  def sayHello(who: String): Unit = {
    println(s"hello world to $who")
  }
}
