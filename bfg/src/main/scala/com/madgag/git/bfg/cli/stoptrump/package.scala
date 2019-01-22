package com.madgag.git.bfg.cli

import scala.util.Random

package object finalmessage {

  def dontGiveUp(): String = {

    s"""
       |
       |--
       |You can rewrite history in Git!
       |--
       |
       |""".stripMargin

  }
}
