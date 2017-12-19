/**
 * Flyweightパターン
 *
 * ・一度生成されたインスタンスを保管し、使いまわす
 * ・一度生成したインスタンスを使いまわす点は、Sigletonと同じ
 *
 * ポイント
 * ・Factoryクラス（Singleton）が、一度生成したインスタンスをマップで保管
 * ・キーが同一の場合、マップに格納されているインスタンスを渡す
 *
 */
/**
 * @author Kengo
 *
 */
package flyweight;