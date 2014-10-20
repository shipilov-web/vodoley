package com.vodoley

/**
 * Created by mrsanders on 20.10.14.
 */
object Main extends App {

  val wordList1 = List("Доброго времени суток", "Добрый день", "Рад приветствовать Вас,")

  //Вычисляем сколько слов в каждом списке

  val oneLenght = wordList1.length

  //Генерируем случайные числа
  val rand1 = (Math.random() * oneLenght).toInt

  //строим фразу
  val phrase = wordList1(rand1) //Приветствие

  println("yo! " + phrase )
}
