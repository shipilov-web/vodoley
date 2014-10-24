package com.vodoley

case class RandomElem(lst: List[String]) {

  def getRandom: String = lst((Math.random() * lst.length).toInt)
}
