#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}.business_logic.repositories;#end
#set( $Id_class_name = "${Model_name}Id" )
import tech.clearcode.core.app_core.multitenancy.repositories.TenantCrudRepository;
import ${PACKAGE_NAME}.business_logic.entities.database_groups.main.${Model_name};
import ${PACKAGE_NAME}.business_logic.entities.database_groups.main.ids.$Id_class_name;

import java.util.UUID;

/**
 * <p>Репозиторий модели {@link ${Model_name}}.</p>
 */
public interface ${Model_name}Repository extends TenantCrudRepository<${Model_name}, $Id_class_name, UUID> { }
