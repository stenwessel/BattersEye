package nl.stenwessel.batterseye.view

import javafx.beans.property.Property
import javafx.collections.ObservableList
import javafx.event.EventTarget
import javafx.geometry.Pos
import nl.stenwessel.batterseye.ResizableAutocompleteSkin
import nl.stenwessel.batterseye.asObservableList
import nl.stenwessel.batterseye.model.GameModel
import nl.stenwessel.batterseye.model.Team
import nl.stenwessel.batterseye.model.TeamModel
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
}


class GameStep : View("Teams") {
    val game: GameModel by inject()
    val teamModel: TeamModel by inject()

    override val root = form {
        fieldset(title) {
            selectTeamField("Home team", game.home)
            selectTeamField("Away team", game.away)

            hbox(alignment = Pos.CENTER_RIGHT, spacing = 15) {
                label("Team not yet created?")
                button("New team", graphic = label("+")).action {
                    teamModel.item = Team()
                    find<TeamForm>().openModal()
                }
            }
        }
    }

    /**
     * Creates a form field where a team can be selected.
     *
     * @param label The form field label.
     * @param property The property to bind the form input to.
     * @param values The teams the user can choose from. Defaults to all teams in [Team.INSTANCES].
     *
     * @return A form field.
     */
    private fun EventTarget.selectTeamField(label: String, property: Property<Team>,
            values: ObservableList<Team> = Team.INSTANCES.asObservableList()) = field(label) {

        combobox(property, values) {
            required()
            isEditable = true
            visibleRowCount = 5
            skin = ResizableAutocompleteSkin(this, null)

            useMaxWidth = true
        }
    }
}
