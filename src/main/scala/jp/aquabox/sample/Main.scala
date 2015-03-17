package jp.aquabox.sample

import jp.aquabox.sample.lib.Kuromoji


/**
 * Created by motonari on 15/03/17.
 */
object Main {

  def main(args: Array[String]): Unit = {
    Kuromoji.get("今日はいい天気ですね。").map(println _ )
  }
}
