package jp.aquabox.sample

import org.atilika.kuromoji.{Token, Tokenizer}

/**
 * Created by motonari on 15/03/17.
 */
object Main {
  val tokenizer = Tokenizer.builder.mode(Tokenizer.Mode.NORMAL).build

  val tokens = this.tokenizer.tokenize("今日はいい天気ですね。").toArray

  def main(args: Array[String]) {
    tokens.map( s => println( s.asInstanceOf[Token].getSurfaceForm ) )
  }
}
