package nl.stenwessel.batterseye.data

/**
 * @author Sten Wessel
 */
enum class BaseHitType(val toBase: Base) {
    SINGLE(Base.FIRST),
    DOUBLE(Base.SECOND),
    GROUND_RULE_DOUBLE(Base.SECOND),
    TRIPLE(Base.THIRD),
    HOME_RUN(Base.HOME),
    INSIDE_PARK_HOME_RUN(Base.HOME)
}
