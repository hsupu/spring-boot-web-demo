package demo.dal.util;

/**
 * @author xp
 */
public class DaoUtils {

    private DaoUtils() {}

    public static Integer convertNullPointerToZero(Integer value) {
        return (value != null) ? value : 0;
    }

}
