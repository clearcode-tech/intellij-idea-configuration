#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.business_logic.services.entities;#end
#set( $Id_class_name = "${Model_name}Id" )
import ${PACKAGE_NAME}.business_logic.entities.databases.main.${Model_name};
import ${PACKAGE_NAME}.business_logic.entities.databases.main.ids.${Model_name}Id;
import ${PACKAGE_NAME}.business_logic.repositories.${Model_name}Repository;
import tech.clearcode.core.app_core.services.entities.EntityService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.UUID;

/**
 * Сервис модели {@link ${Model_name}}.
 */
@Named
@Singleton
public final class ${Model_name}Service extends EntityService<${Model_name}, ${Id_class_name}, ${Model_name}Repository, UUID> {
    //region Ctor

    @Inject
    public ${Model_name}Service(${Model_name}Repository repository) {

        super(repository, ${Model_name}.class);
    }

    //endregion
    //region Public
    
    

    //endregion
}
