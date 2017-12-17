/**
 * Observerパターン
 *
 * Visitorパターンと似ている（発展版）
 * ・Subject：Listを持ったVisitor
 * ・Observer：Acceptor
 *
 * Listの要素分処理を実施するところはCompositeパターンに似ている
 *
 *
 * 以下のようなメソッドを作ると、ダブルディスパッチ（相互委譲）が可能
 * （例）Subject→Observer→Subject
 *
 * [Subject]
 *  ovsever.dispatch(this)
 *
 * [Observer]
 *  dispatch(Subject) {
 *     Subject.dispatched()
 *  }
 *
 * [Subject]
 *  dispatched() {
 *     println("Hello World")
 *  }
 *
 * 委譲のポイント：引数に自分を入れて、渡すこと
 *
 * run(this)
 * dhispatch()
 *
 *
 */
/**
 * @author Kengo
 *
 */
package observer;