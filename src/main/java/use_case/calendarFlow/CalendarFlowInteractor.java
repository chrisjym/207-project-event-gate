package use_case.calendarFlow;

import entity.Event;
import java.util.List;

public class CalendarFlowInteractor implements CalendarFlowInputBoundary {
    private final CalendarFlowDataAccessInterface calendarFlowDataAccess;
    private final CalendarFlowOutputBoundary calendarFlowOutputBoundary;

    CalendarFlowInteractor(CalendarFlowDataAccessInterface calendarFlowDataAccess,
                           CalendarFlowOutputBoundary calendarFlowOutputBoundary) {
        this.calendarFlowDataAccess = calendarFlowDataAccess;
        this.calendarFlowOutputBoundary = calendarFlowOutputBoundary;
    }

    @Override
    public void execute(CalendarFlowInputData inputData) {

    }
}
