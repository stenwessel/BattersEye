package nl.stenwessel.batterseye.view

import javafx.beans.property.Property
import nl.stenwessel.batterseye.model.Team
import tornadofx.*

/**
 *
 * @author Sten Wessel
 */
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
                selectTeamField("Home team", game.home)
                selectTeamField("Away team", game.away)
            }
        }

        /**
         * Creates a form field where a team can be selected or created.
         *
         * @param label The form field label.
         * @param property The property to bind the form input to.
         * @param values The teams the user can choose from. Defaults to all teams in [Team.INSTANCES].
         *
         * @return A form field.
         */
        private fun selectTeamField(label: String, property: Property<Team>,
                                    values: List<Team> = Team.INSTANCES.toList()) = field(label) {
            combobox(property, values) {
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
    }
}
