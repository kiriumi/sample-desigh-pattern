/**
 * Builderパターン
 *
 * ・Client：Directorに商品作成を依頼し、受け取る
 * ・Director：Builderに商品を作る工程を指示し、Builderが作った商品をClientに渡す
 * ・IfBUilder：DirectorがBuilderに出す指示
 * ・Builder：Directorの支持を受け、商品を組み立てる。できた商品をDirectorに渡す
 * ・Product：商品
 */
/**
 * @author Kengo
 *
 */
package create.builder;