package gov.epa.bencloud.api.function;

import java.util.Arrays;
import java.util.List;

/*
 * Provides resources related to a given valuation function functional form.
 */
public class VFNative8 implements VFNative{
    public static final String functionalForm = "((median_income)/(52*5))*WageIndex";

    /**
     * Returns the valuation results using the given functional form and arguments.
     */
    @Override
    public double calculate(VFArguments args) {
        return ((args.medianIncome)/(52.0*5.0))*args.wageIndex;
    }
    
    @Override
    public List<String> getRequiredVariables() {
        return Arrays.asList("median_income");
    }
}
