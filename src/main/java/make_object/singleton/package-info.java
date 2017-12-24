/**
 * Singletonパターン
 *
 * ・一度オブジェクトを生成したら、それを使いまわす
 * ・設定を読込み、保持しておく場合などに有効
 *
 * 注意
 *  ・Singleton（オブジェクト）の状態を変更させるのは、望ましくない（トークンなど）
 *  ・インスタンスをstaticで保持するため、メモリを圧迫する（∵GarbageCollection されない）
 *
/**
 * @author Kengo
 *
 */
package make_object.singleton;