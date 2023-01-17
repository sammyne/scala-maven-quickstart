/* Copyright (C) 2023 sammyne. All rights reserved. */
package com.github.sammyne

/**
 * greeter package.
 */
package object greeter {
  /**
   * Print greeting msg for who to stdout.
   * 
   * @param who name of person to greet.
   */
  def sayHello(who: String): Unit = {
    println(s"hello world to $who")
  }

  object AdHocForScalaDocBug // ref: https://github.com/scala/bug/issues/8124
}
