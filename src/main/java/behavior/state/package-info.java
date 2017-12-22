/**
 * Stateパターン
 * ・State ＝ 処理実施用オブジェクト
 * ・あるオブジェクトがStateをメンバーで保持し、Stateに処理を任せる
 *
 * ポイント
 * ・Stateオブジェクトの状態により、if/switch分を使うことなく処理を切り分ける
 * ・Strategyとの違いは、オブジェクトの状態を変化させるかどうか（Stateは変化する）
 *
 * 注意
 * ・オブジェクトの状態を変化させるので、テストしづらい
 * ・オブジェクトの状態を変化させない、Strategyの方が望ましい
 *
 *
/**
 * @author Kengo
 *
 */
package behavior.state;