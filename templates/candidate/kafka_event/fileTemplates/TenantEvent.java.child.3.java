#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.business_logic.pubsub.handlers;#end

import jakarta.inject.Named;
import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import tech.clearcode.core.app_core.pubsub.EventHandler;
import ${PACKAGE_NAME}.business_logic.pubsub.events.${Event_Name_Without_Event_On_End}Event;

/**
 * Обработчик события о ${Event_Name_Without_Event_On_End}.
 */
@AllArgsConstructor
@Named
@Singleton
@Slf4j
public final class ${Handler_Name}On${Event_Name_Without_Event_On_End}EventHandler
    implements EventHandler<${Event_Name_Without_Event_On_End}Event> {
    //region Fields



    //endregion
    //region Public

    /**
     * Обрабатывает событие о ${Event_Name_Without_Event_On_End}.
     *
     * <p></p>
     *
     * @param event Событие о ${Event_Name_Without_Event_On_End}.
     */
    @Override
    public void handle(${Event_Name_Without_Event_On_End}Event event) {

        // Реализация обработки события
    }

    //endregion
}
