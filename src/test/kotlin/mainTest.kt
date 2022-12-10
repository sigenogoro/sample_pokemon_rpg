import controller.main
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

// 仮テスト（できることを確認)
class mainTest: StringSpec({
    "バトルを始めると表示する"{
        main() shouldBe "バトルスタート"
    }
})