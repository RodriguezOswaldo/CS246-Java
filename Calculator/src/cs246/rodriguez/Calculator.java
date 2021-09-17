package cs246.rodriguez;

public class Calculator {
    //member data
    //scope datatype name;
    private float result;

    //class constructor, it is created because there is a member data that needs to be initialized, it has the same class name
    public Calculator(){
        result = 0.0f;
    }

    //member method/function
    //scope void = no return name( parameters passed)
    public void add(float value){
        result += value;
    }
    public void subtract(float value) {
        result -= value;
    }
    public void multiply(float value) {
        result *= value;
    }
    public void divide(float value) {
        /*Check for divide by zero */
        if (value == 0.0f){
            result = 0.0f;
        } else {
            result /= value;
        }
    }
    public void  reset(){
        result = 0.0f;
    }
    public float getResult(){
        return result;
    }

}
