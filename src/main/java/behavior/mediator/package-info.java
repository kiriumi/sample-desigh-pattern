/**
 * Mediatorパターン
 *
 * ・Collegue：Mediator（仲介者）を決め、needAdviceでアドバイスを求める
 * ・Mediator：Collegue（同僚）をMapで保持し、アドバイスが来たら保持しているCollegue全員に指示する
 *
 *   ※CollegueにState/Strategyを持たせると相性が良いと思われる
 *
 */
/**
 * @author Kengo
 *
 */
package behavior.mediator;