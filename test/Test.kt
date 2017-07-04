import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

/**
 *
 * @author Sten Wessel
 */
object TestSpec : Spek({
    describe("a test") {
        on("testing") {
            it("should be successful") {
                assert(true)
            }
        }
    }
})
