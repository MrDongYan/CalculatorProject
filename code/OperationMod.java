public class OperationMod extends Operation{
    @Override
    public double GetRestul() {
        return this.get_numberA() / this.get_numberB();
    }
}
