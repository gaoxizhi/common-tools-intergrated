package pers.zuo.component.restaurant.Meal;

/**
 * @author zuojingang
 * @Title: Powder
 * @Description: 炒河粉
 * @date 2019-09-11 17:07
 */
public class Powder implements Meal {

    @Override
    public String getDescription() {
        return "炒河粉";
    }

    @Override
    public double cost() {
        return 9.0;
    }
}
