package nl.stenwessel.batterseye.view

import nl.stenwessel.batterseye.model.Game
import tornadofx.*

/**
 *
 * @author Sten Wessel
 */
class GameModel : ItemViewModel<Game>() {
    val home = bind(Game::home)
    val away = bind(Game::away)
}
