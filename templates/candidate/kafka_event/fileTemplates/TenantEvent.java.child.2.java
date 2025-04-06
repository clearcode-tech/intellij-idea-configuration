#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.pubsub_kafka.subscribers;#end

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import ${PACKAGE_NAME}.business_logic.pubsub.events.${Event_Name_Without_Event_On_End}Event;
import ${PACKAGE_NAME}.business_logic.pubsub.topics.${Event_Name_Without_Event_On_End}Topic;
import ${PACKAGE_NAME}.business_logic.pubsub.handlers.${Handler_Name}On${Event_Name_Without_Event_On_End}EventHandler;
import tech.clearcode.core.app_core.configuration.ApplicationConfiguration;
import tech.clearcode.core.app_core.pubsub.SubscriberConfiguration;
import tech.clearcode.core.app_core.pubsub.Topic;
import tech.clearcode.core.app_core.pubsub_kafka.AbstractKafkaSubscriber;

/**
 * Подписчик на событие о ${Event_Description}.
 */
@Named
@Singleton
public final class Kafka${Handler_Name}On${Event_Name_Without_Event_On_End}EventSubscriber
    extends AbstractKafkaSubscriber<${Event_Name_Without_Event_On_End}Event> {
    //region Constants

    /**
     * ID группы, к которой относится подписчик.
     */
    private static final String GROUP_ID = "${Loercase_Handler_Name}On${Event_Name_Without_Event_On_End}EventSubscriberGroup";

    //endregion
    //region Ctor

    @Inject
    private Kafka${Handler_Name}On${Event_Name_Without_Event_On_End}EventSubscriber(
        SubscriberConfiguration subscriberConfiguration,
        ApplicationConfiguration applicationConfiguration,
        ${Handler_Name}On${Event_Name_Without_Event_On_End}EventHandler eventHandler
    ) {
        super(subscriberConfiguration, applicationConfiguration, GROUP_ID, eventHandler);
    }

    //endregion
    //region Public

    @Override
    public Topic<${Event_Name_Without_Event_On_End}Event> getTopic() {

        return ${Event_Name_Without_Event_On_End}Topic.INSTANCE;
    }

    //endregion
}
