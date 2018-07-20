package nl.stenwessel.batterseye.data

/**
 * @author Sten Wessel
 */
enum class Base(val previous: Base?) {
    FIRST(null),
    SECOND(FIRST),
    THIRD(SECOND),
    HOME(THIRD)
}
