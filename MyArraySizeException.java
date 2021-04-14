package Home_work_2;

public class MyArraySizeException extends CustomException {

    public MyArraySizeException() {
        super("The matrix must be of size 4x4");
    }
}