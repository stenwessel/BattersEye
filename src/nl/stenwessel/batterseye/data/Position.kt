package nl.stenwessel.batterseye.data

/**
 * @author Sten Wessel
 */
enum class Position(val shortName: String, val code: String, val substitute: Boolean = false) {
    PITCHER("P", "1"),
    CATCHER("C", "2"),
    FIRST_BASEMAN("1B", "3"),
    SECOND_BASEMAN("2B", "4"),
    THIRD_BASEMAN("3B", "5"),
    SHORT_STOP("SS", "6"),
    LEFT_FIELDER("LF", "7"),
    CENTER_FIELDER("CF", "8"),
    RIGHT_FIELDER("RF", "9"),
    DESIGNATED_HITTER("DH", "DH"),
    PINCH_HITTER("PH", "PH", substitute = true),
    PINCH_RUNNER("PR", "PR", substitute = true)
}
