package org.solovyev.android.calculator.history;

import org.jetbrains.annotations.NotNull;
import org.solovyev.android.calculator.CalculatorEventListener;
import org.solovyev.common.history.HistoryHelper;

/**
 * User: Solovyev_S
 * Date: 20.09.12
 * Time: 16:11
 */
public interface CalculatorHistory extends HistoryHelper<CalculatorHistoryState>, CalculatorEventListener {

    void fromXml(@NotNull String xml);

    String toXml();

    void clearSavedHistory();

    void removeSavedHistory(@NotNull CalculatorHistoryState historyState);
}