// java-common.gradle.kts
// 実際に各サブプロジェクトへ適用するPlugin
// この内容がappとserviceに適用される
// 使う側で id("java-common")として設定する
// Gradle開始
//       │
//       ▼
// ① buildSrcを見つける
//       │
//       ▼
// ② buildSrc/build.gradle.kts を実行
//       │
//       ▼
// Kotlin DSL Pluginを使えるようにする
//       │
//       ▼
// ③ java-common.gradle.kts をコンパイル
//       │
//       ▼
// Convention Plugin完成
//       │
//       ▼
// ④ app/build.gradle.kts
// plugins {
//     id("java-common")
// }
//       │
//       ▼
// java-commonの内容を適用
plugins {
  java
}

repositories {
  mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
