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
