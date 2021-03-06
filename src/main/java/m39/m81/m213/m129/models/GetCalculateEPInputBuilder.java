/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package m39.m81.m213.m129.models;

import java.util.*;

public class GetCalculateEPInputBuilder {
    //the instance to build
    private GetCalculateEPInput getCalculateEPInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetCalculateEPInputBuilder() {
        getCalculateEPInput = new GetCalculateEPInput();
    }

    /**
     * The operator to apply on the variables
     */
    public GetCalculateEPInputBuilder operation(OperationTypeEnum operation) {
        getCalculateEPInput.setOperation(operation);
        return this;
    }

    /**
     * The LHS value
     */
    public GetCalculateEPInputBuilder x(double x) {
        getCalculateEPInput.setX(x);
        return this;
    }

    /**
     * The RHS value
     */
    public GetCalculateEPInputBuilder y(double y) {
        getCalculateEPInput.setY(y);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetCalculateEPInput build() {
        return getCalculateEPInput;
    }
}