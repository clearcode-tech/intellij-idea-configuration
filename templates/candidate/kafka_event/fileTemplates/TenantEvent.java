#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.business_logic.pubsub.events;#end
#if (${Handler_Name}) #end
#if (${Lowercase_Handler_Name}) #end

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import tech.clearcode.core.app_core.multitenancy.mode_partition.pubsub.events.TenantEvent;
import tech.clearcode.core.app_core.multitenancy.models.ids.TenantIdValue;

/**
 * Событие о ${Event_Description}.
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Getter
@SuperBuilder(toBuilder = true)
public final class ${Event_Name_Without_Event_On_End}Event extends TenantEvent {
  //region Fields



  //endregion
  //region Static factories

  public static ${Event_Name_Without_Event_On_End}Event of(TenantIdValue tenantIdValue) {

    return ${Event_Name_Without_Event_On_End}Event.builder()
        .tenantId(tenantIdValue.get())
        .build();
  }

  //endregion
}
