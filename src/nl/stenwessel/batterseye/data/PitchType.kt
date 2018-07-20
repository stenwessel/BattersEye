package nl.stenwessel.batterseye.data

/**
 * @author Sten Wessel
 */
enum class PitchType(countsAs: CountPitchType, isFoulBall: Boolean = false, inPlay: Boolean = false) {
    CALLED_STRIKE(countsAs = CountPitchType.STRIKE),
    SWINGING_STRIKE(countsAs = CountPitchType.STRIKE),
    FOUL(countsAs = CountPitchType.STRIKE, isFoulBall = true),
    FOUL_TIP(countsAs = CountPitchType.STRIKE),
    FOUL_TIP_ON_BUNT(countsAs = CountPitchType.STRIKE),
    FOUL_BUNT(countsAs = CountPitchType.STRIKE),
    MISSED_BUNT_ATTEMPT(countsAs = CountPitchType.STRIKE),
    SWINGING_ON_PITCHOUT(countsAs = CountPitchType.STRIKE),
    FOUL_BALL_ON_PITCHOUT(countsAs = CountPitchType.STRIKE, isFoulBall = true),
    UNKNOWN_STRIKE(countsAs = CountPitchType.STRIKE),

    BALL(countsAs = CountPitchType.BALL),
    INTENTIONAL_BALL(countsAs = CountPitchType.BALL),
    HIT_BATTER(countsAs = CountPitchType.BALL),
    PITCHOUT(countsAs = CountPitchType.BALL),
    CALLED_BALL_PITCHER_MOUTH(countsAs = CountPitchType.BALL),

    BALL_PUT_IN_PLAY(countsAs = CountPitchType.STRIKE, inPlay = true),
    BALL_PUT_IN_PLAY_ON_PITCHOUT(countsAs = CountPitchType.STRIKE, inPlay = true),

    NO_PITCH(countsAs = CountPitchType.NONE),
    UNKNOWN(countsAs = CountPitchType.NONE)
}

enum class CountPitchType { BALL, STRIKE, NONE }
