package school.lesson_5;

public class TestMethod<T> {
    public static <T> T[] swapArrayElements(T[] testArray, int firstElementId, int secondElementId) {

        if (testArray == null) throw new NullPointerException("Такого массива нет");

        if ((firstElementId < 0 || firstElementId >= testArray.length) ||
                (secondElementId < 0 || secondElementId >= testArray.length)) {
            throw new ArrayIndexOutOfBoundsException("Элемента с таким индексом нет");
        }
        T i = testArray[firstElementId];
        testArray[firstElementId] = testArray[secondElementId];
        testArray[secondElementId] = i;
        return testArray;
    }
}
