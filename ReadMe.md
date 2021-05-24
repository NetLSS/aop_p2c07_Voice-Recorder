# 녹음기 어플

## 목차
0. 인트로, 프로젝트 셋업
1. 기본 UI 구성하기
2. 권한 요청하기
3. 녹음 기능 구현하기
4. 완성도 높이기 - 오디오 시각화
5. 완성도 높이기 - 마무리

## 기능 

- 마이크를 통해 음성을 녹음할 수 있다.
- 녹음한 음성을 재생할 수 있다.
- 음성을 시각화해서 볼 수 있다.

## 사용기술

- Request runtime permissions (마이크 권한)
- CustomView (음성 시각화)
- MediaRecorder (녹음)

## 상태

녹음 전 - 녹음 중 - 녹음 후 - 재생중

## 기타

<img src="https://developer.android.com/images/training/permissions/workflow-runtime.svg" />
- Android에서 런타임 권한을 선언하고 요청하는 워크플로를 보여 주는 다이어그램

<img src="https://developer.android.com/images/mediarecorder_state_diagram.gif"/>
- Used to record audio and video. The recording control is based on a simple state machine

## 결과화면
|Screenshot1|Screenshot2|
|---|---|
|<img src="https://i.imgur.com/WUjmIC5.png"/>|<img src="https://i.imgur.com/CUbK9TT.png"/>|
