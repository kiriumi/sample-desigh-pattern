/**
 * Visitorパターン
 *
 * ・VisitorをAcceptorに派遣し、Visitorに処理実施してもらう
 *   ※処理オブジェクトを渡すイメージ
 *
 * ・引数に相手を入れることで、相互委譲が可能となる
 *     ・Acceptorクラス ：accept(Visitor) { visitor.run() }
 *     ・Visitorクラス  ：visit(Acceptor) { acceptor.execute() }
 */
/**
 * @author Kengo
 *
 */
package behavior.visitor;