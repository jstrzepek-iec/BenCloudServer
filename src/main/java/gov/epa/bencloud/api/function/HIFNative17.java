package gov.epa.bencloud.api.function;

public class HIFNative17 implements HIFNative{
   
    public static final String functionalForm = "(1-(1/exp(BETA*DELTAQ)))*INCIDENCE*POPULATION*A*B";
    
    @Override
    public double calculate(HIFArguments args) {
        return (1.0 - (1.0 / Math.exp(args.beta * args.deltaQ))) * args.incidence * args.population * args.a * args.b;
    }
}