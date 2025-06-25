# 🎧 프로젝트명: SoundStore

> 특별한 사운드를 유저들과 공유하고 찾을 수 있는 공간
> 노래, 효과음, 배경음 기타 등등의 대한 사운드들의 정보를 공유하는 공간입니다!

---

## 🧠 개발 배경

> 원하는 느낌의 효과음을 찾기 어렵거나 라이선스 문제로 영상에서 사용 가능한 소리가 제한적이라
> 문제 없는 사운드를 여러 사이트를 통해서 찾는 등 다양한 사운드를 사용하는 데에 불편함이 많이 발생합니다.
> 
> 이러한 문제점들을 해결할 방법으로 사운드를 공유하고 업로드하는 "사운드 스토어" 콘솔 프로그램 프로젝트를 진행하게 되었습니다

---

## 🔍 요구사항 명세서

### 요구사항 정의
![요구사항 정의서](./imgs/RequirementsDefinition.png)

### 요구사항 명세서 ([요구사항 명세서](https://docs.google.com/spreadsheets/d/1eLR46TsCTyzi2-oHuJ4Jh1tjbZ6jeBRgaJTdUylKOZY/edit?usp=sharing))
#### 1. 기능 요구사항
> ##### 사운드 (SOUND)
> ![요구사항 명세 사운드](./imgs/RequirementsSpecification_Sound.png)

> ##### 유저 (USER)
> ![요구사항 명세 유저](./imgs/RequirementsSpecification_User.png)

> ##### 금액 (PRICE)
> ![요구사항 명세 금액](./imgs/RequirementsSpecification_Price.png)


#### 2. 비기능 요구사항

> ##### 데이터 (DATA)
> ![요구사항 명세 데이터](./imgs/RequirementsSpecification_Data.png)

> ##### 시스템 환경 (SYSTEM)
> ![요구사항 명세 시스템](./imgs/RequirementsSpecification_System.png)
---

## ✨ 주요 기능

- [x] 사운드 업로드
- [x] 내 사운드 보기 (업로드한 사운드, 좋아요한 사운드, 보유중인 사운드)
- [x] 사운드 목록 보기
- [x] 사운드 좋아요/구매/다운로드

---

## 🎬 작동 시나리오

![작동 시나리오](./img/scenario.png)

---

## 🧭 클래스 다이어그램

### 📁 sound 패키지  
![sound 클래스 다이어그램](./img/class_sound.png)

### 📁 user 패키지  
![user 클래스 다이어그램](./img/class_user.png)

### 📁 app 패키지  
![app 클래스 다이어그램](./img/class_app.png)

---

## ⚙️ 프로젝트 개발 환경

- Java 17
- IntelliJ IDEA / Eclipse
- Windows 10
- Git / GitHub

---

## 💻 프로젝트 실행 환경

- JDK 17 이상
- 콘솔 환경 (CLI 기반)
- 실행 파일: `SoundStoreMain.jar`

