/**
 * Observerパターン
 *
 * ・Visitorパターンと類似（発展版）
 * ・SubjectがListのObserverに行き、処理を実施する
 *     ・Subject：Listを持ったVisitor
 *     ・Observer：Acceptor
 *
 * ・引数に相手を入れることで、相互委譲が可能となる
 *     ・Subjectクラス ：action(Observer) { observer.run() }
 *     ・Observerクラス：update(Subject)  { subject.execute() }
 *
 */
/**
 * @author Kengo
 *
 */
package sepalate_process.observer;