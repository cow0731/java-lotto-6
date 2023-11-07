package lotto.view;

public class OutputView {

    public static final String INPUT_PURCHASE_AMOUNT_MESSAGE = "구입금액을 입력해 주세요.";

    public static final String INFORM_PURCHASE_MESSAGE = "개를 구매했습니다.";

    public static final String INPUT_WINNING_NUMBER_MESSAGE = "당첨 번호를 입력해 주세요.";

    public static final String INPUT_BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";

    public void printInputPurchaseAmountMessage() {
        System.out.println(INPUT_PURCHASE_AMOUNT_MESSAGE);
    }

    public void printInformPurchaseMessage(int lottoTicket) {
        System.out.println("\n" + lottoTicket + INFORM_PURCHASE_MESSAGE);
    }

    public void printInputWinningNumberMessage() {
        System.out.println("\n" + INPUT_WINNING_NUMBER_MESSAGE);
    }

    public void printInputBonusNumberMessage() {
        System.out.println("\n" + INPUT_BONUS_NUMBER_MESSAGE);
    }
}
