package org.jazzteam.oop.model.statistic;

import java.util.List;

public interface IAnalyser {

    Report analyse(List<Statistic> statistics);
}
