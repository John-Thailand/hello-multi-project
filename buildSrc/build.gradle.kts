// buildSrcプロジェクトの設定ファイル
plugins {
  // Convention PluginをKotlin DSLで書けるようにするPlugin
  `kotlin-dsl`
}

// kotlin-dslを使うためにmavenCentralリポジトリからライブラリを取得するようにしたい
repositories {
  mavenCentral()
}
