/**
 * AbstractFactoryパターン
 *
 * ・抽象化した工場（AbstractFactory）
 *     ＝テンプレート化した生産ライン
 *     ＝抽象Factoryクラスに、製品作成に必要な部品（オブジェクト）の生成メソッド群をまとめる
 *
 * 前提：製作工程が同じだが、違う製品を作る（例：犬と猫のぬいぐるみ）
 * 目的：製品を作るのに、誤った部品が生成されてくるのを防ぐ（例：手、足など）
 *
 * 備考：Factory/FactoryMethodとの違い
 *   ・AbstractFactory…必要な部品の生成メソッド群をまとめる
 *   ・FactoryMethod  …オブジェクト生成の抽象化
 *
 */
/**
 * @author Kengo
 *
 */
package create.abstruct_factory;