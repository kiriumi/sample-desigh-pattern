/**
 * Prototypeパターン
 *
 * ・一度生成したインスタンス（プロトタイプ）を複製する
 *
 * ポイント
 * ・PrototypeインターフェースにCloneableインターフェースをextendsし
 *     cleateClone()と実施する処理を定義
 *
 * ・Prototypeインターフェースを実装し、createClone(){ return clone(); }でオーバーライド
 *   ※Narrowコピーなので注意！（プリミティブ型のメンバーのみクローンされる）
 */
/**
 * @author Kengo
 *
 */
package create.prototype;