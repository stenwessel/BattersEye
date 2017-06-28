package nl.stenwessel.batterseye.app

import javafx.application.Application
import javafx.scene.image.Image
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyCodeCombination
import javafx.scene.input.KeyCombination
import nl.stenwessel.batterseye.model.Team
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
        addIcons()
        loadDiskData()

        FX.layoutDebuggerShortcut = KeyCodeCombination(KeyCode.J, KeyCombination.CONTROL_DOWN, KeyCombination.ALT_DOWN)
    }

    override fun stop() {
        saveDiskData()
        super.stop()
    }

    private fun addIcons() {
        addStageIcon(Image("/img/icons/app16.png"))
        addStageIcon(Image("/img/icons/app32.png"))
        addStageIcon(Image("/img/icons/app48.png"))
        addStageIcon(Image("/img/icons/app256.png"))
    }

    private fun loadDiskData() {
        // Load saved teams
        config.jsonArray("teams")?.toModel<Team>()
    }

    private fun saveDiskData() {
        with(config) {
            // Save teams
            set("teams" to Team.INSTANCES.toJSON())
            save()
        }
    }
}


fun main(args: Array<String>) {
    Application.launch(BattersEyeApp::class.java, *args)
}
