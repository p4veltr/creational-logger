package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        for (Integer val: source) {
            if (val < treshold) {
                logger.log("Элемент '"+val+"' не проходит");
            } else {
                logger.log("Элемент '"+val+"' проходит");
                result.add(val);
            }
        }
        logger.log("Прошло фильтр "+result.size()+" элемента из "+source.size());
        logger.log("Выводим результат на экран: "+result);
        return result;
    }
}
