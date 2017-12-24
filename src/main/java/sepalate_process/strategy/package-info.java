/**
 * Strategyパターン
 * ・Strategy ＝ 処理実施用オブジェクト
 * ・あるオブジェクトがStrategyをメンバーで保持し、Stateに処理を任せる
 *
 * ポイント
 * ・Strategyの種類によって、if/switch分を使うことなく処理を切り分ける
 * ・Stateとの違いは、オブジェクトの状態を変化させるかどうか（Strategyは変化させない）
 *
 */
/**
 * @author Kengo
 *
 */
package sepalate_process.strategy;