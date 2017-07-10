/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.healthvault.restapi;

import com.microsoft.healthvault.restapi.models.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ActionPlanObjectives.
 */
public interface ActionPlanObjectives {
    /**
     * Remove an action plan objective.
     *
     * @param actionPlanId The instance of the plan that the objective belongs to.
     * @param objectiveId The instance of the objective to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Object object if successful.
     */
    Object delete(String actionPlanId, String objectiveId);

    /**
     * Remove an action plan objective.
     *
     * @param actionPlanId The instance of the plan that the objective belongs to.
     * @param objectiveId The instance of the objective to delete.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Object> deleteAsync(String actionPlanId, String objectiveId, final ServiceCallback<Object> serviceCallback);

    /**
     * Remove an action plan objective.
     *
     * @param actionPlanId The instance of the plan that the objective belongs to.
     * @param objectiveId The instance of the objective to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<Object> deleteAsync(String actionPlanId, String objectiveId);

    /**
     * Remove an action plan objective.
     *
     * @param actionPlanId The instance of the plan that the objective belongs to.
     * @param objectiveId The instance of the objective to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Object object
     */
    Observable<ServiceResponse<Object>> deleteWithServiceResponseAsync(String actionPlanId, String objectiveId);

}