package gov.epa.bencloud.api.function;

public class HIFNativeFactory {

    public static HIFNative create(String functionalForm) {
        if (functionalForm == null || functionalForm.isEmpty()) {
            return null;
        }

        if (functionalForm.equalsIgnoreCase(HIFNative1.functionalForm)) {
            return new HIFNative1();
        } else if (functionalForm.equalsIgnoreCase(HIFNative2.functionalForm)) {
            return new HIFNative2();
        } else if (functionalForm.equalsIgnoreCase(HIFNative3.functionalForm)) {
            return new HIFNative3();
        } else if (functionalForm.equalsIgnoreCase(HIFNative4.functionalForm)) {
            return new HIFNative4();
        } else if (functionalForm.equalsIgnoreCase(HIFNative5.functionalForm)) {
            return new HIFNative5();
        } else if (functionalForm.equalsIgnoreCase(HIFNative6.functionalForm)) {
            return new HIFNative6();
        } else if (functionalForm.equalsIgnoreCase(HIFNative7.functionalForm)) {
            return new HIFNative7();
        } else if (functionalForm.equalsIgnoreCase(HIFNative8.functionalForm)) {
            return new HIFNative8();
        } else if (functionalForm.equalsIgnoreCase(HIFNative9.functionalForm)) {
            return new HIFNative9();
        } else if (functionalForm.equalsIgnoreCase(HIFNative10.functionalForm)) {
            return new HIFNative10();
        } else if (functionalForm.equalsIgnoreCase(HIFNative11.functionalForm)) {
            return new HIFNative11();
        } else if (functionalForm.equalsIgnoreCase(HIFNative12.functionalForm)) {
            return new HIFNative12();
        } else if (functionalForm.equalsIgnoreCase(HIFNative13.functionalForm)) {
            return new HIFNative13();
        } else if (functionalForm.equalsIgnoreCase(HIFNative14.functionalForm)) {
            return new HIFNative14();
        } else if (functionalForm.equalsIgnoreCase(HIFNative15.functionalForm)) {
            return new HIFNative15();
        } else if (functionalForm.equalsIgnoreCase(HIFNative16.functionalForm)) {
            return new HIFNative16();
        } else if (functionalForm.equalsIgnoreCase(HIFNative17.functionalForm)) {
            return new HIFNative17();
        } else if (functionalForm.equalsIgnoreCase(HIFNative18.functionalForm)) {
            return new HIFNative18();
        }
/*

todo: add baseline functions

INCIDENCE*POPULATION
INCIDENCE*POPULATION*A
INCIDENCE*POPULATION*(1-A)
A*POPULATION*PREVALENCE
PREVALENCE*POPULATION
A*POPULATION
INCIDENCE*POPULATION*A*B
 * 
 * 
 */
        return null;
    }

}
