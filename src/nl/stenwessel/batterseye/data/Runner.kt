package nl.stenwessel.batterseye.data

/**
 * @author Sten Wessel
 */
enum class Runner(val base: Base? = null) {
    BATTER,
    FROM_FIRST(Base.FIRST),
    FROM_SECOND(Base.SECOND),
    FROM_THIRD(Base.THIRD);

    companion object {
        fun fromBase(base: Base) = Runner.values().find { it.base == base }
    }
}
