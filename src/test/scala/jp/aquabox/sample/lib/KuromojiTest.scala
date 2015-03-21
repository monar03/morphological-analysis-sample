package jp.aquabox.sample.lib

import org.scalatest.{FunSpec, Matchers}

/**
 * Created by motonari on 15/03/18.
 */
class KuromojiTest extends FunSpec with Matchers {

  describe("形態素解析テスト") {
    it("名詞") {
      val word_data = Kuromoji("今日")
      word_data map {
        s => {
          s.feature shouldBe "名詞"
          s.surface shouldBe "今日"
        }
      }
    }

    it("動詞") {
      val word_data = Kuromoji("走る")
      word_data map {
        s => {
          s.feature shouldBe "動詞"
          s.surface shouldBe "走る"
        }
      }
    }
  }
}