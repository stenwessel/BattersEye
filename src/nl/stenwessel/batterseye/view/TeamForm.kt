package nl.stenwessel.batterseye.view

import javafx.scene.control.TextFormatter
import javafx.scene.layout.Pane
import nl.stenwessel.batterseye.data.Team
import nl.stenwessel.batterseye.model.TeamModel
import tornadofx.*

/**
 *
 * @author Sten Wessel
 */
class TeamForm : View("Edit team details") {
    override val root = Pane()
    val model: TeamModel by inject()

    init {
        with(root) {
            form {
                fieldset("Edit team details") {
                    field("Name") {
                        textfield(model.name) {
                            required()
                        }
                    }
                    field("Abbreviation") {
                        textfield(model.abbreviation) {
                            required()
                            textFormatter = TextFormatter<String> { t -> t.apply { text = text.toUpperCase() } }
                        }
                    }
                    button("Save") {
                        enableWhen(model.valid)
                        action { save() }
                    }
                }
            }
        }
    }

    private fun save() {
        model.commit {
            Team.INSTANCES += model.item
            close()
        }
    }
}

