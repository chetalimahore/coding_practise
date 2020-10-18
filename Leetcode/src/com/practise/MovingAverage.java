import java.util.*;

class MovingAverage {

    private int windowSize;
    private Queue<Integer> currentWindow;
    private double sum = 0.0;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        currentWindow = new LinkedList<Integer>();
        windowSize = size;
    }

    public double next(int val) {
        if(currentWindow.size() == windowSize)
        {
            int removedNumber = currentWindow.remove();
            sum -= removedNumber;
        }

        sum += val;
        currentWindow.add(val);

        System.out.println(sum/currentWindow.size());

        return sum/currentWindow.size();
    }
}
