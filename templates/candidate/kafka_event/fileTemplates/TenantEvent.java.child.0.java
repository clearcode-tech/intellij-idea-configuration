#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.business_logic.pubsub.topics;#end

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import tech.clearcode.core.app_core.pubsub.Topic;
import ${PACKAGE_NAME}.business_logic.pubsub.events.${Event_Name_Without_Event_On_End}Event;

/**
 * Тема для публикации события о ${Event_Description}.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ${Event_Name_Without_Event_On_End}Topic implements Topic<${Event_Name_Without_Event_On_End}Event> {
    //region Constants

    /**
     * Единственный экземпляр темы события о ${Event_Description}.
     */
    public static final ${Event_Name_Without_Event_On_End}Topic INSTANCE = new ${Event_Name_Without_Event_On_End}Topic();

    //endregion
}
