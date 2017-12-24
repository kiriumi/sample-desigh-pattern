/**
 * Mementoパターン
 *
 * 保存したいメンバーのみ、オブジェクトの状態を復元できるようにする。
 *
 * ・Memento：オブジェクトの保存したいメンバー情報を保持する
 * ・Caretaker：Mementの保管庫
 * ・Originator：保存・復元対象のオブジェクト
 *
 *  ※全オブジェクト情報を保持したいのであれば、Mementoは作らず
 *    CloneしたオブジェクトをCaretakerに保管すれば良い
 *
 */
/**
 * @author Kengo
 *
 */
package make_object.mement;