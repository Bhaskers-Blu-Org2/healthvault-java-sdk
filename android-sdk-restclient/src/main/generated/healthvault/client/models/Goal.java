/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package healthvault.client.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A goal defines a target for a measurement or action to be performed by a
 * user.
 * For example, walk 5000 steps per day, burn 1500 calories per day.
 */
public class Goal {
    /**
     * The unique identifier of a goal instance.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name of the goal.
     * For example, Daily walk goal.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The description of the goal.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The start date of the goal in Universal Time Zone(UTC).
     */
    @JsonProperty(value = "startDate")
    private DateTime startDate;

    /**
     * The end date of the goal in Universal Time Zone(UTC).
     * If the end date is in the future, this is the target date.
     */
    @JsonProperty(value = "endDate")
    private DateTime endDate;

    /**
     * Specifies the type of data related to this goal. Possible values
     * include: 'Unknown', 'Steps', 'CaloriesBurned', 'Weight'.
     */
    @JsonProperty(value = "goalType")
    private String goalType;

    /**
     * The goal recurrence metrics.
     * For example, A goal can be defined on a weekly interval, meaning the
     * target is intended to be achieved every week. Walking 50000 steps in a
     * week.
     */
    @JsonProperty(value = "recurrenceMetrics")
    private GoalRecurrenceMetrics recurrenceMetrics;

    /**
     * The primary range of achievement for the goal.
     * For example, the ideal weight or daily steps target.
     */
    @JsonProperty(value = "range")
    private GoalRange range;

    /**
     * Other ranges of achievement for the goal.
     */
    @JsonProperty(value = "additionalRanges")
    private List<GoalRange> additionalRanges;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the Goal object itself.
     */
    public Goal withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Goal object itself.
     */
    public Goal withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the Goal object itself.
     */
    public Goal withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the startDate value.
     *
     * @return the startDate value
     */
    public DateTime startDate() {
        return this.startDate;
    }

    /**
     * Set the startDate value.
     *
     * @param startDate the startDate value to set
     * @return the Goal object itself.
     */
    public Goal withStartDate(DateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the endDate value.
     *
     * @return the endDate value
     */
    public DateTime endDate() {
        return this.endDate;
    }

    /**
     * Set the endDate value.
     *
     * @param endDate the endDate value to set
     * @return the Goal object itself.
     */
    public Goal withEndDate(DateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the goalType value.
     *
     * @return the goalType value
     */
    public String goalType() {
        return this.goalType;
    }

    /**
     * Set the goalType value.
     *
     * @param goalType the goalType value to set
     * @return the Goal object itself.
     */
    public Goal withGoalType(String goalType) {
        this.goalType = goalType;
        return this;
    }

    /**
     * Get the recurrenceMetrics value.
     *
     * @return the recurrenceMetrics value
     */
    public GoalRecurrenceMetrics recurrenceMetrics() {
        return this.recurrenceMetrics;
    }

    /**
     * Set the recurrenceMetrics value.
     *
     * @param recurrenceMetrics the recurrenceMetrics value to set
     * @return the Goal object itself.
     */
    public Goal withRecurrenceMetrics(GoalRecurrenceMetrics recurrenceMetrics) {
        this.recurrenceMetrics = recurrenceMetrics;
        return this;
    }

    /**
     * Get the range value.
     *
     * @return the range value
     */
    public GoalRange range() {
        return this.range;
    }

    /**
     * Set the range value.
     *
     * @param range the range value to set
     * @return the Goal object itself.
     */
    public Goal withRange(GoalRange range) {
        this.range = range;
        return this;
    }

    /**
     * Get the additionalRanges value.
     *
     * @return the additionalRanges value
     */
    public List<GoalRange> additionalRanges() {
        return this.additionalRanges;
    }

    /**
     * Set the additionalRanges value.
     *
     * @param additionalRanges the additionalRanges value to set
     * @return the Goal object itself.
     */
    public Goal withAdditionalRanges(List<GoalRange> additionalRanges) {
        this.additionalRanges = additionalRanges;
        return this;
    }

}
