/**
 * Commandパターン
 *
 * ・Invoker：Commandを制御するクラス（Commandのスタック／キュー）
 * ・Command：実施する処理をRecieverに依頼する（印刷、スキャン・コピーなど）
 * ・Reciever：実際に処理を行うクラス（Cannonのプリンタ、Epsonのプリンタなど）
 *
 * ポイント
 * ・Receiverインターフェースで用意したメソッド毎にCommandクラスを作成する
 *
 */
/**
 * @author Kengo
 *
 */
package structure.command;