#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.business_logic.entities.databases.main.ids;#end
#set( $Id_class_name = "${Model_name}Id" )
import ${PACKAGE_NAME}.business_logic.entities.databases.main.${Model_name};

import java.util.UUID;

/**
 * <p>Интерфейс модели, которая содержит ID модели {@link ${Model_name}}.</p>
 */
public interface With${Id_class_name} {
    //region Public

    /**
     * <p>Возвращает ID ${Name_in_Russian_genetive_decapitalized}.</p>
     *
     * @return ID ${Name_in_Russian_genetive_decapitalized}.
     */
    UUID get${Id_class_name}();

    //endregion
}
