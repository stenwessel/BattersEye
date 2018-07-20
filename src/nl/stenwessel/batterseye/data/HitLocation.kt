package nl.stenwessel.batterseye.data

/**
 * @author Sten Wessel
 */
class HitLocation(
        val ballTrajectory: BallTrajectory,
        val position: Int,
        val isBunt: Boolean = false
) {}
