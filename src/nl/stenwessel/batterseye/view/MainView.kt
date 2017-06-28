package nl.stenwessel.batterseye.view

import nl.stenwessel.batterseye.app.BattersEyeApp
import nl.stenwessel.batterseye.model.Team
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
        graphic = resources.imageview("/img/icons/app64.png")
        add(GameStep::class)
    }

    class GameStep : View("Game data") {
        val game: GameModel by inject()

        override val root = form {
            fieldset(title) {
                field("Home team") {
                    combobox(game.home, Team.INSTANCES.toList()) {
                        required()
                        isEditable = true
                        makeAutocompletable {
                            items.filter { t -> t.toString().contains(it, true) }
                        }

                        useMaxWidth = true
                    }
                    button("+") {
                        usePrefWidth = true
                    }
                }
                field("Away team") { }
            }
        }
    }
}
