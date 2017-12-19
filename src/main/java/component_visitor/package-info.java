/**
 * CompositeパターンにVisitorパターンの組合せ
 *
 * ポイント
 * ・Component（=Acceptor）にaccept()を用意
 * ・各ComponentにVisitorが行き、処理（visit()）を実施
 *
 * サンプルの構成
 *
 * Comosite0
 *  ├ Leaf1
 *  └ Composite1
 *      └ Leaf2
 *
 */
/**
 * @author Kengo
 *
 */
package component_visitor;