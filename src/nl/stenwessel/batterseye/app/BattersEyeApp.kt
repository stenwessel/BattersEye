package nl.stenwessel.batterseye.app

import javafx.application.Application
import javafx.scene.image.Image
import nl.stenwessel.batterseye.view.MainView
import tornadofx.*

/**
 * Main application class.
 *
 * @author Sten Wessel
 */
class BattersEyeApp : App(MainView::class) {
    companion object {
        const val VERSION = "0.1.0"
        const val TITLE = "BattersEye Scoring $VERSION"
    }

    init {
        addStageIcon(Image(""))
    }
}

fun main(args: Array<String>) {
    Application.launch(BattersEyeApp::class.java, *args)
}
