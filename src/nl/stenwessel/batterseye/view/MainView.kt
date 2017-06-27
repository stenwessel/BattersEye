package nl.stenwessel.batterseye.view

import nl.stenwessel.batterseye.app.BattersEyeApp
import tornadofx.*

/**
 *
 * @author Sten Wessel
 */
class MainView : View(BattersEyeApp.TITLE) {
    override val root = anchorpane {
        prefWidth = 400.0
        prefHeight = 250.0

        button("Score a new game").action {
            find<GameWizard> { openModal() }
        }
    }
}

class GameWizard : Wizard("Score a new game", "Please provide game details") {
    val game: GameModel by inject()

    init {
        add(GameStep::class)
    }

    class GameStep : View("Game data") {
        val game: GameModel by inject()

        override val root = form {
            fieldset(title) {
                field("Home team") {  }
                field("Away team") {  }
            }
        }
    }
}
