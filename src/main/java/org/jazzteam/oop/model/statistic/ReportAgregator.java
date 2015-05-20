package org.jazzteam.oop.model.statistic;

import java.util.List;

public class ReportAgregator {

    public void showReports(List<Report> reports) {
        for (Report report : reports) {
            System.out.println(report);
        }
    }

}
