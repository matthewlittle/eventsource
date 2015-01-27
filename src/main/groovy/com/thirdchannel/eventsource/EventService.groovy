package com.thirdchannel.eventsource

/**
 * @author steve pember
 *
 * DAO Service for loading and persisting {@link Event}s.
 */
public interface EventService {

    // get
    // load all from Aggregate

    // load all from Aggregate in Date Range
    // load all since revision

    // save all events

    List<Event> findAllEventsForAggregate(Aggregate aggregate)
    List<Event> findAllEventsForAggregateSinceRevision(Aggregate aggregate, Integer integer)
    List<Event> findAllEventsForAggregateSinceDate(Aggregate aggregate, Date date)
    List<Event> findAllEventsForAggregateInRange(Aggregate, Date begin, Date end)

}