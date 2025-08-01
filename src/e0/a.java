package e0;

/**
 * Утилитарный класс для математических операций с координатами
 */
public abstract class GeometryUtils {

    /**
     * Вычисляет евклидово расстояние между двумя точками
     * @param x1 координата X первой точки
     * @param y1 координата Y первой точки
     * @param x2 координата X второй точки
     * @param y2 координата Y второй точки
     * @return расстояние между точками
     */
    public static float calculateDistance(float x1, float y1, float x2, float y2) {
        float dx = x2 - x1;
        float dy = y2 - y1;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}