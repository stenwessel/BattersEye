package nl.stenwessel.batterseye.model

import tornadofx.*

/**
 *
 * @author Sten Wessel
 */
class Game(val home: Team, val away: Team)

class GameModel : ItemViewModel<Game>() {
    val home = bind(Game::home)
    val away = bind(Game::away)
}


