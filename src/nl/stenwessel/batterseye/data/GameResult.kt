package nl.stenwessel.batterseye.data

import java.time.Duration

/**
 * @author Sten Wessel
 */
class GameResult(
        val game: Game,
        val duration: Duration? = null,
        val attendance: Int? = null,
        val winningPitcher: Player,
        val losingPitcher: Player,
        val save: Player? = null
)
