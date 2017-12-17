/**
 * CompositeパターンにVisitorパターンの組合せ
 *
 * Componentにaccept()を用意
 * 各種ComponentにVisitorが行き、処理（visit()）を実施
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