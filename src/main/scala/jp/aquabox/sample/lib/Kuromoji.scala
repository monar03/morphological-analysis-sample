package jp.aquabox.sample.lib

import org.atilika.kuromoji.{Token, Tokenizer}

/**
 * Created by motonari on 15/03/17.
 */
object Kuromoji {
  /**
   * 形態素解析
   */
  private[this] val tokenizer = Tokenizer.builder.mode(Tokenizer.Mode.NORMAL).build

  /**
   * 解析結果の取得
   */
  def get(str:String) = this.tokenizer.tokenize(str).toArray.map (
    s => new WordsData(s.asInstanceOf[Token].getSurfaceForm, s.asInstanceOf[Token].getAllFeatures.split(",")(0))
  )

  def apply(str:String) = get(str)
}

/**
 * Wordデータ
 *
 * @param surface
 * @param feature
 */
case class WordsData(surface:String, feature:String)