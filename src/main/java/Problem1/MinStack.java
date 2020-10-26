package Problem1;
//yelp:(
public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack

    public MinStack(int size) {
        super(size);
    }

    @Override
    public boolean push(Integer val) {
        super.push(val);

        if(size() == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Integer pop() {
        return super.pop();
    }

    public Integer getMin() {
        // homework
        // loop of any kind is not allowed
        return -1; // place holder
    }
}

