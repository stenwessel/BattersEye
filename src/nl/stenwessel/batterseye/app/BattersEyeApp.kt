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
        addStageIcon(Image("/img/icons/app16.png"))
        addStageIcon(Image("/img/icons/app32.png"))
        addStageIcon(Image("/img/icons/app48.png"))
        addStageIcon(Image("/img/icons/app256.png"))
    }
}

fun main(args: Array<String>) {
    Application.launch(BattersEyeApp::class.java, *args)
}
