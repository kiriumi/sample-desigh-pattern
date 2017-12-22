/**
 * Bridgeパターン
 *
 * ・Implementerインターフェース、およびその実装クラスは既存のモノ
 * ・Bridge：コンストラクタでImplementerを受け取り、Implementerをメンバーとして持つ
 *           Implementerのもつメソッドを使うメソッドを用意
 * ・Refined：追加した機能
 * ・Client：Refinedのコンストラクタに、Implementerの実装クラスを渡すことで、
 *           既存クラスの機能と追加した機能両方を使うことができる
 *
 */
/**
 * @author Kengo
 *
 */
package structure.bridge;