#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.pubsub_kafka.publishers;#end

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import ${PACKAGE_NAME}.business_logic.pubsub.events.${Event_Name_Without_Event_On_End}Event;
import ${PACKAGE_NAME}.business_logic.pubsub.topics.${Event_Name_Without_Event_On_End}Topic;
import tech.clearcode.core.app_core.pubsub.PublisherConfiguration;
import tech.clearcode.core.app_core.pubsub.Topic;
import tech.clearcode.core.app_core.pubsub_kafka.AbstractKafkaPublisher;

/**
 * Издатель события о ${Event_Description}.
 */
@Named
@Singleton
public final class Kafka${Event_Name_Without_Event_On_End}EventPublisher extends AbstractKafkaPublisher<${Event_Name_Without_Event_On_End}Event> {
    //region Ctor

    @Inject
    public Kafka${Event_Name_Without_Event_On_End}EventPublisher(PublisherConfiguration configuration) {
        super(configuration);
    }

    //endregion
    //region Public

    @Override
    public Topic<${Event_Name_Without_Event_On_End}Event> getTopic() {

        return ${Event_Name_Without_Event_On_End}Topic.INSTANCE;
    }

    //endregion
}
