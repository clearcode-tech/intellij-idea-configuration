#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.business_logic.entities.database_groups.main.ids;#end
#set( $Id_class_name = "${Model_name}Id" )
import ${PACKAGE_NAME}.business_logic.entities.database_groups.main.${Model_name};

import java.util.UUID;

/**
 * Интерфейс модели, которая содержит ID модели {@link ${Model_name}}.
 */
public interface With${Id_class_name} {
    //region Public

    /**
     * Возвращает ID ${Name_in_Russian_genetive_decapitalized}.
     *
     * @return ID ${Name_in_Russian_genetive_decapitalized}.
     */
    UUID get${Id_class_name}();

    //endregion
}
