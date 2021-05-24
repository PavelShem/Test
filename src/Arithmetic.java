public class Arithmetic {
    public int numOne;
    public int numTwo;

    public Arithmetic(int numOne, int numTwo){
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public int sumNum(){
        return numOne + numTwo;
    }

    public int diff(){
        return numOne - numTwo;
    }

    public int multiplication(){
        return numOne * numTwo;
    }

    public int avg(){
        return (numOne * numTwo) / 2;
    }

    public int minNum(){
        return Math.min(numOne, numTwo);
    }
    public int maxNum(){
        return Math.max(numOne, numTwo);
    }
}
