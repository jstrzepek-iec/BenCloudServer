package gov.epa.bencloud.api.function;

/*
 * Provides resources related to a given valuation function functional form.
 */
public class VFNative3 implements VFNative{
    public static final String functionalForm = "A*MedicalCostIndex*B";

    /**
     * Returns the valuation results using the given functional form and arguments.
     */
    @Override
    public double calculate(VFArguments args) {
        return args.a * args.medicalCostIndex * args.b;
    }
}
