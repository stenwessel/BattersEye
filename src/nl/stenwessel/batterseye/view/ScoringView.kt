package nl.stenwessel.batterseye.view

import nl.stenwessel.batterseye.app.BattersEyeApp
import tornadofx.*

/**
 *
 * @author Sten Wessel
 */
class ScoringView : View(BattersEyeApp.TITLE) {
    override val root = borderpane {
        prefWidth = 800.0
        prefHeight = 800.0

        top = label("Scoring")
        left = drawer(multiselect = true) {
            item("Away lineup", expanded = true) {  }
            item("Home lineup", expanded = true) {  }
        }
    }
}
