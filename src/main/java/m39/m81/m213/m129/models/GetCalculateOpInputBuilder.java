/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package m39.m81.m213.m129.models;

import java.util.*;

public class GetCalculateOpInputBuilder {
    //the instance to build
    private GetCalculateOpInput getCalculateOpInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetCalculateOpInputBuilder() {
        getCalculateOpInput = new GetCalculateOpInput();
    }

    /**
     * The operator to apply on the variables
     */
    public GetCalculateOpInputBuilder operation(OperationTypeEnum operation) {
        getCalculateOpInput.setOperation(operation);
        return this;
    }

    /**
     * The LHS value
     */
    public GetCalculateOpInputBuilder x(double x) {
        getCalculateOpInput.setX(x);
        return this;
    }

    /**
     * The RHS value
     */
    public GetCalculateOpInputBuilder y(double y) {
        getCalculateOpInput.setY(y);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetCalculateOpInput build() {
        return getCalculateOpInput;
    }
}