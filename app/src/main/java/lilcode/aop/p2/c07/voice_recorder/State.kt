package lilcode.aop.p2.c07.voice_recorder

// 상태에 따라 버튼을 달리 보여주게 하기 위해 사용 할 것임.

enum class State {
    BEFORE_RECORDING,
    ON_RECORDING,
    AFTER_RECORDING,
    ON_PLAYING
}