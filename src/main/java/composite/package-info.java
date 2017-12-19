/**
 * Conpositeパターン
 *
 * ・再帰的な処理に対して適している（∵配下の要素を同一のモノとして扱える）
 *
 * ・Composite（← <<Composite>> ）
 *     ・add()    ：配下の要素をリストに格納
 *     ・execute()：実施する処理
 *                  ＋ リストに格納した配下にもexecute()を実施
 *
 * ・Leaf（← <<Composite>> ）
 *     ・execute()：実施する処理
 *
 * サンプルの構成
 *
 * Comosite0
 *  ├ Leaf1
 *  └ Composite1
 *      └ Leaf2
 */
/**
 * @author Kengo
 *
 */
package composite;